package produtos;

import java.util.Calendar;

public class ProdutoAlimenticio extends Produto{
	
	private Calendar dataValidade;
	
	public ProdutoAlimenticio(String codigo,String nome,float preco,Calendar dataVal) {
		super(codigo,nome,preco);
		this.setDataValidade(dataVal);
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
}
