package produtos;

public class ProdutoEletronico extends Produto{
	
	private String marca;
		
	public ProdutoEletronico(String codigo,String nome,float preco,String marca) {
		super(codigo,nome,preco);
		
		setMarca(marca);
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}