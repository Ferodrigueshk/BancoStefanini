package br.com.bancostefanini;

public class ContaCorrente extends Conta implements ContaPrivate, Emprestimo {

	private Long limite;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(Long limite, Integer agencia) {
		super();
		this.limite = limite;
	}


	public Long getLimite() {
		return limite;
		
	}
//	@Override
//	public void sacar(Double valorSaque) {
//		super.sacar(valorSaque);
//	}

	@Override
	public void saqueExtra(Float taxa) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emprestimo(Float taxa) {
		// TODO Auto-generated method stub
		
	}
	
	

}
