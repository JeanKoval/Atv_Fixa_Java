package jeankoval.com.github.programa;

import jeankoval.com.github.classes.Carro;
import jeankoval.com.github.classes.Endereco;
import jeankoval.com.github.classes.Proprietario;

public class Main {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("Agenor Ramiro dos Anjos", 43, "Sitio Cercado", "Curitiba", "Paraná", "81920415", "Casa");
		
		Proprietario prop = new Proprietario("12345678912", "1234567891", end);
		prop.setNome("Jean Carlos Koval");
		
		Carro carro = new Carro(prop.getNome());
		
		System.out.println("O Proprietário: " + prop.getNome());
		end.toString();
		System.out.println("É dono do veiculo "+ carro.getMarca() +" "+carro.getModelo()+" "+ carro.getCor());

	}

}
