package produtos;

public class Produto {
	
	private String codigo;
	private String nome;
	private float preco;
	
	public Produto(String codigo,String nome,float preco) {
		setCodigo(codigo);
		setNome(nome);
		setPreco(preco);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	
}
