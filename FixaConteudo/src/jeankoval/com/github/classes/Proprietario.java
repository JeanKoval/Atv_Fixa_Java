package jeankoval.com.github.classes;

public class Proprietario {
	
	private String nome;
	private String cpf;
	private String rg;
	private String dataNasc;
	private Endereco endereco;
	
	public Proprietario(String cpf, String rg, Endereco endereco) {
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

}