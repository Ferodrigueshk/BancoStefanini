package br.com.bancostefanini;

import java.util.Date;
import java.math.BigDecimal;

public class Pessoa {

	private String nome;
	private Integer cpf;
	private Long idade;
	private Boolean vivo;
	private Date nascimento;
	private BigDecimal saldo;
	
	public Pessoa() {
		
	}
	
	public void setNome(String nome) {
		
	}
	public String getNome() {
		return nome;
	}
	
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setIdade(Long idade) {
		this.idade = idade;
	}
	public Long getIdade() {
		return idade;
	}
	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}
	public Boolean getVivo() {
		return vivo;
	}
	public void setNascimento(Date nascimento){
		this.nascimento = nascimento;
	}
	public Date getNascimento(){
		return nascimento;
	}
	public void setSaldo(BigDecimal saldo){
		this.saldo = saldo;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	
//	livro erik evans ddd
	
	
	
}
