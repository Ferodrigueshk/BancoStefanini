package br.com.bancostefanini;

public class Run {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Fagner");
		pessoa.setCpf(1234567891);
	
		System.out.println(pessoa.getNome());
	}
	
}
