package jeankoval.com.github.classes;

public class Endereco {
	
	private String rua;
	private Integer num;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;
	
	public Endereco(String rua, Integer num, String bairro, String cidade, String estado, String cep, String complemento) {
		this.rua = rua;
		this.num = num;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
	}
	
	@Override
	public String toString() {
		StringBuilder dadosEndereco = new StringBuilder();
		dadosEndereco.append("Endere?o: Rua " + this.rua + ", "+ this.num + ", "+this.bairro+", "+this.cidade+", "+this.estado);
		return dadosEndereco.toString();
	}
	
	public String getRua() {	return rua;	}
	public void setRua(String rua) {	this.rua = rua;	}
	
	public Integer getNum() {	return num;	}
	public void setNum(Integer rua) {	this.num = num;	}

	public String getBairro() {	return bairro;	}
	public void setBairro(String bairro) {	this.bairro = bairro;	}

	public String getCidade() {	return cidade;	}
	public void setCidade(String cidade) {	this.cidade = cidade;	}

	public String getEstado() {	return estado;	}
	public void setEstado(String estado) {	this.estado = estado;	}

	public String getCep() {	return cep;	}
	public void setCep(String cep) {	this.cep = cep;	}

	public String getComplemento() {	return complemento;	}
	public void setComplemento(String complemento) {	this.complemento = complemento;	}
	
}
