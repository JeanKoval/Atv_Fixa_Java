package jeankoval.com.github.classes;

public class Carro {
	
	private String modelo;
	private String cor;
	private Integer ano;
	private String marca;
	private String chassi;
	private Integer veloMaxima;
	private Integer veloAtual;
	private Integer numPortas;
	private boolean teto;
	private Integer numMarchas;
	private Integer marchaAtual;
	private boolean automatico;
	private Integer volComb;
	private Proprietario prop;
	
	public Carro(Proprietario prop) {
		this.prop = prop;
		this.ano = 2001;
		this.veloMaxima = 120;
		this.veloAtual = 0;
		this.volComb = 0;
		this.marchaAtual = 0;
		this.numMarchas = 6;
		this.numPortas = 2;
		this.chassi = "12121546586445";
		this.modelo = "Corsa Wind";
		this.cor = "Prata";
		this.marca = "Chevrolet";
		this.automatico = false;
		this.teto = false;
	}

	public void acelera() {
		if(this.veloAtual < this.veloMaxima) {
			this.veloAtual += 1;
		}else {
			System.out.println("Voce já atingiu a velocidade máxima! Aceleração não permitida.");
		}
		
	}
	
	public void freia() {
		this.veloAtual = 0;
	}
	
	public void sobeMarcha() {
		if(this.marchaAtual > numMarchas) {
			this.marchaAtual += 1;
		}else {
			System.out.println("Excedeu o número maximo de marchas a desenvolver.");
		}
	}
	
	public void desceMarcha() {
		if(this.marchaAtual > 1) {
			this.marchaAtual -= 1;
		}else {
			System.out.println("Voce já está em primeira marcha.");
		}
	}
	
	public void marchaRe() {
		if(this.veloAtual == 0) {
			this.marchaAtual = this.numMarchas;
		}else {
			System.out.println("Marchar ré não pode ser engatada com o veiculo em movimento.");
		}		
	}
	
	@Override
	public String toString() {
		StringBuilder dadosCarro = new StringBuilder();
		dadosCarro.append("Veiculo: Marca "+ this.marca +", modelo "+ this.modelo +", cor "+ this.cor +" do ano de "+ this.ano);
		return dadosCarro.toString();
	}
	
	public void setProp(Proprietario prop) {
		this.prop = prop;
	}
	
	public Proprietario getProp() {
		return prop;
	}

	public String getModelo() {	return modelo; }
	public void setModelo(String modelo) {	this.modelo = modelo; }

	public String getCor() {	return cor;	}
	public void setCor(String cor) {	this.cor = cor;	}

	public Integer getAno() {	return ano;	}
	public void setAno(Integer ano) {	this.ano = ano;	}

	public String getMarca() {	return marca;	}
	public void setMarca(String marca) {	this.marca = marca;	}

	public String getChassi() {	return chassi;	}
	public void setChassi(String chassi) {	this.chassi = chassi;	}

	public Integer getVeloMaxima() {	return veloMaxima;	}
	public void setVeloMaxima(Integer veloMaxima) {	this.veloMaxima = veloMaxima;	}

	public Integer getVeloAtual() {	return veloAtual;	}
	public void setVeloAtual(Integer veloAtual) {	this.veloAtual = veloAtual;	}

	public Integer getNumPortas() {	return numPortas;	}
	public void setNumPortas(Integer numPortas) {	this.numPortas = numPortas;	}

	public boolean getTeto() {	return teto;	}
	public void setTeto(boolean teto) {	this.teto = teto;	}

	public Integer getNumMarchas() {	return numMarchas;	}
	public void setNumMarchas(Integer numMarchas) {	this.numMarchas = numMarchas;	}

	public Integer getMarchaAtual() {	return marchaAtual;	}
	public void setMarchaAtual(Integer marchaAtual) {	this.marchaAtual = marchaAtual;	}

	public boolean getAutomatico() {	return automatico;	}
	public void setAutomatico(boolean automatico) {	this.automatico = automatico;	}

	public Integer getVolComb() {	return volComb;	}
	public void setVolComb(Integer volComb) {	this.volComb = volComb;	}
}
