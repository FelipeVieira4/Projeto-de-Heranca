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
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Commandos add, remover e lista");
			commmand=scan.nextLine();
			
			
			switch(commmand) {
				case "add":
					System.out.println("Escolha um tipo de produto\nEletronico\nVestuario\nAlimenticio");
					String tipoProduto=scan.nextLine();
					switch(tipoProduto) {
						case "Eletronico":

							System.out.println("Codigo Produto");
							String codigoEle =scan.nextLine();
							
							System.out.println("Nome Produto");
							String nomeEle =scan.nextLine();
							
							System.out.println("Preço Produto");
							float precoEle=scan.nextFloat();
	
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
							
							System.out.println("Preço Produto");
							float precoVes =scan.nextFloat();
							
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
							
							System.out.println("Preço Produto");
							float precoAli =scan.nextFloat();
							
							scan= new Scanner(System.in);
							
							System.out.println("--Data de válidade--");
							int dia = scan.nextInt();
							int mes = scan.nextInt();
							int ano = scan.nextInt();
							
							Calendar calendar = Calendar.getInstance();
							calendar.set(dia, mes-1, ano);
							
							produtosAlimenticio.add(new ProdutoAlimenticio(codigoAli,nomeAli,precoAli,calendar));
							break;
					}
					
					break;
				case "remover":
						System.out.println("Digite posicao do item a ser removido:");
						int itemID=scan.nextInt();
					
					
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
						}
					break;
				case "lista":
						System.out.println("-PRODUTOS ELÊTRONICOS-");
						for(ProdutoEletronico i : produtosEletronico) {
							System.out.println("Codigo:"+i.getCodigo()+"\n"+
												"Nome:"+i.getNome()+"\n"+
												"Preço:"+i.getPreco()+"\n"+
												"Marca:"+i.getMarca());
						}
						
						System.out.println("-PRODUTOS VESTUARIO-");
						for(ProdutoVestuario i : produtosVestuario) {
							System.out.println("Codigo:"+i.getCodigo()+"\n"+
												"Nome:"+i.getNome()+"\n"+
												"Preço:"+i.getPreco()+"\n"+
												"Tamanho:"+i.getTamanho());
						}
						
						System.out.println("-PRODUTOS Alimenticio-");
						for(ProdutoAlimenticio i : produtosAlimenticio) {
							System.out.println("Codigo:"+i.getCodigo()+"\n"+
												"Nome:"+i.getNome()+"\n"+
												"Preço:"+i.getPreco()+"\n"+
												"Marca:"+i.getDataValidade());
						}
					break;
			}
			
		}while(!commmand.equals("sair"));
		
		scan.close();
	}

}
