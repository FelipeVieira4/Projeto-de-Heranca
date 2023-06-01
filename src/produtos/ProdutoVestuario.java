package produtos;

public class ProdutoVestuario extends Produto{
	
	private tamVestuario tamanho;
	
	public ProdutoVestuario(String codigo,String nome,float preco) {
		super(codigo,nome,preco);
	}

	public tamVestuario getTamanho() {
		return tamanho;
	}

	public void setTamanho(tamVestuario tamanho) {
		this.tamanho = tamanho;
	}
	
	public String informacoes() {
		return this.getCodigo()+":"+this.getNome()+":"+this.getPreco();
	}
	
}
