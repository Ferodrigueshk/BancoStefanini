package br.com.bancostefanini;

public class Conta {

	private Integer conta;
	private Integer agencia;
	private Double saldo;
	private EnumStatusConta status;
	private Long codigoPix;
//	private Double sacar;
	
	
	public Integer getConta() {
		return conta;
	}
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public EnumStatusConta getStatus() {
		return status;
	}
	public void setStatus(EnumStatusConta status) {
		this.status = status;
	}
	public Long getCodigoPix() {
		return codigoPix;
	}
	public void setCodigoPix(Long codigoPix) {
		this.codigoPix = codigoPix;
	}
	public void sacar(Double valorSaque) {
		
		this.saldo = saldo - valorSaque;
	}
	
	
	
	
}
