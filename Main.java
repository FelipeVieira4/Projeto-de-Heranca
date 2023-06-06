package principal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import produtos.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<ProdutoEletronico> produtosEletronico = new ArrayList<ProdutoEletronico>();
		ArrayList<ProdutoVestuario> produtosVestuario = new ArrayList<ProdutoVestuario>();
		ArrayList<ProdutoAlimenticio> produtosAlimenticio = new ArrayList<ProdutoAlimenticio>();
		
		String commmand = null;
		Scanner scan;
		
		do {
			scan=new Scanner(System.in);
			System.out.println("\nCommandos add, remover e lista\n");
			commmand=scan.nextLine();
			
			
			switch(commmand) {
				case "add":
					System.out.println("Escolha um tipo de produto\nEletronico\nVestuario\nAlimenticio\n");
					String tipoProduto=scan.nextLine();
					switch(tipoProduto) {
						case "Eletronico":

							System.out.println("Codigo Produto");
							String codigoEle =scan.nextLine();
							
							System.out.println("Nome Produto");
							String nomeEle =scan.nextLine();
							
							float precoEle;
							do {
								System.out.println("Preço Produto");
								precoEle=scan.nextFloat();
							}while(precoEle<=0);
	
							scan= new Scanner(System.in);
							
							System.out.println("Marca Produto");
							String marcaEle =scan.nextLine();
							
							produtosEletronico.add(new ProdutoEletronico(codigoEle,nomeEle,precoEle,marcaEle));
							break;
						case "Vestuario":

							System.out.println("Codigo Produto");
							String codigoVes =scan.nextLine();
							
							System.out.println("Nome Produto");
							String nomeVes =scan.nextLine();
							
							float precoVes;
							do {
								System.out.println("Preço Produto");
								precoVes =scan.nextFloat();
							}while(precoVes<=0);
							
							scan= new Scanner(System.in);
							
							System.out.println("Tamanho Produto");
							tamVestuario tamanho = tamVestuario.valueOf(scan.nextLine());

							produtosVestuario.add(new ProdutoVestuario(codigoVes,nomeVes,precoVes,tamanho));
							break;
						case "Alimenticio":

							System.out.println("Codigo Produto");
							String codigoAli =scan.nextLine();
							
							System.out.println("Nome Produto");
							String nomeAli =scan.nextLine();
							
							float precoAli;
							do {
								System.out.println("Preço Produto");
								precoAli=scan.nextFloat();
							}while(precoAli<=0);
							
							scan= new Scanner(System.in);
							
							System.out.println("--Data de válidade--");
							int dia = scan.nextInt();
							int mes = scan.nextInt();
							int ano = scan.nextInt();
							
							Calendar calendar = Calendar.getInstance();
							calendar.set(dia, mes-1, ano);
							
							produtosAlimenticio.add(new ProdutoAlimenticio(codigoAli,nomeAli,precoAli,calendar));
							break;
							default:
								System.out.println("Tipo não encontado");
					}
					
					break;
				case "remover":
						System.out.println("\nDigite posicao do item a ser removido:");
						int itemID=scan.nextInt();
						scan = new Scanner(System.in);
						
						if(itemID<0) System.out.println("Número tem quer ser maior ou igual a 0");
						else {
							System.out.println("Escolha um tipo de produto\nEletronico\nVestuario\nAlimenticio");
							String tipoProdutoRem=scan.nextLine();
														
								switch(tipoProdutoRem) {
									case "Eletronico":
										if(itemID<produtosEletronico.size())
											produtosEletronico.remove(itemID);
										
										break;
									case "Vestuario":
										if(itemID<produtosVestuario.size())
											produtosVestuario.remove(itemID);
										
										break;
									case "Alimenticio":
										if(itemID<produtosAlimenticio.size())
											produtosAlimenticio.remove(itemID);
										
										break;
									default:
										System.out.println("Tipo não encontado");
								}
						}
						
					break;
				case "lista":
					
						int idItem=0;
					
						float valorTotalEletronico=0;
						//Lista produto ELÊTRONICOS
						System.out.println("-PRODUTOS ELÊTRONICOS-");
						for(ProdutoEletronico i : produtosEletronico) {
							System.out.println("ID:"+idItem+"\n"+
												"Codigo:"+i.getCodigo()+"\n"+
												"Nome:"+i.getNome()+"\n"+
												"Preço:"+i.getPreco()+"\n"+
												"Marca:"+i.getMarca());
							
							valorTotalEletronico+=i.getPreco();
							idItem++;
						}
						System.out.println("-----------------------");
						
						idItem=0;
						
						float valorTotalVestiario=0;
						//Lista produto VESTUARIO
						System.out.println("-PRODUTOS VESTUARIO-");
						for(ProdutoVestuario i : produtosVestuario) {
							System.out.println("ID:"+idItem+"\n"+
												"Codigo:"+i.getCodigo()+"\n"+
												"Nome:"+i.getNome()+"\n"+
												"Preço:"+i.getPreco()+"\n"+
												"Tamanho:"+i.getTamanho());
							valorTotalVestiario+=i.getPreco();
							idItem++;
						}
						System.out.println("-----------------------");
						
						idItem=0;
						
						float valorTotalAlimenticio=0;
						//Lista produto Alimenticio
						System.out.println("-PRODUTOS ALIMENTICIO-");
						for(ProdutoAlimenticio i : produtosAlimenticio) {
							System.out.println("ID:"+idItem+"\n"+
												"Codigo:"+i.getCodigo()+"\n"+
												"Nome:"+i.getNome()+"\n"+
												"Preço:"+i.getPreco()+"\n"+
												"Data Validade:"+i.getDataValidade().getTime());
							valorTotalAlimenticio+=i.getPreco();
							idItem++;
						}
						System.out.println("-----------------------");
						
						System.out.println("\n\n------VALOR ESTOQUE-------");
						System.out.println("Eletronico:"+valorTotalEletronico);
						System.out.println("Vestiario:"+valorTotalVestiario);
						System.out.println("Alimenticio:"+valorTotalAlimenticio);
						
					break;
			}
			
		}while(!commmand.equals("sair"));
		
		scan.close();
	}

}
