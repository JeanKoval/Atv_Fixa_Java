package jeankoval.com.github.programa;

import jeankoval.com.github.classes.Carro;
import jeankoval.com.github.classes.Endereco;
import jeankoval.com.github.classes.Proprietario;

public class Main {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("Agenor Ramiro dos Anjos", 43, "Sitio Cercado", "Curitiba", "Paraná", "81920415", "Casa");
		
		Proprietario prop = new Proprietario("Jean carlos Koval","12345678911", "1234567891", end);
		
		Carro carro = new Carro(prop);
		
		System.out.println("Proprietário: " + carro.getProp().getNome());
		System.out.println(end.toString());
		System.out.println(carro.toString());
		
		System.out.println("CPF Ajustado: "+prop.cpf());
		
		System.out.println("Rua do Proprietário: "+ carro.getProp().getEndereco().getRua());

	}

}
