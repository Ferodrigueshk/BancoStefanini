 package br.com.bancostefanini;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.getLimite();
		contaCorrente.getCodigoPix();
		contaCorrente.setSaldo(Double.valueOf(100));
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(Double.valueOf(100));
		/* Criando objeto do tipo conta corrente */
		Conta conta = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		conta.setAgencia(1254);
		
		/* Cast - polimorfismo */
		/* instaceof verifica a origem da instancia */
		if(conta instanceof ContaPoupanca) {
			((ContaPoupanca)conta).getValorRendimento();
			
		} else if ( conta instanceof ContaCorrente) {
			((ContaCorrente)conta).getLimite();
			((ContaCorrente)conta).emprestimo(1.5f);
			((ContaCorrente)conta).emprestimo(1.5f);
			conta.setSaldo(Double.valueOf(2500));
			
			conta.setStatus(EnumStatusConta.ATIVO);
			System.out.println(conta.getStatus().getDescricao());
			System.out.println(conta.getSaldo());
		}
		
		
		/* Mais especifico*/
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(conta);
		lista.add(poupanca);
		
		
		
		/* Mais generico, comparado ao de cima*/
		/* Garante um acoplamento menor*/
//		List listas = new ArrayList<>(); 
		
		/* Exemplo primeira aula */
//		Pessoa pessoa = new Pessoa();
//		
//		pessoa.setNome("Fagner");
//		pessoa.setCpf(1234567891);
//	
//		System.out.println(pessoa.getNome());
	}
	
}
