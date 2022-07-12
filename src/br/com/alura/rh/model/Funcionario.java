package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private LocalDate dataUltimoReajuste;
	private DadosPessoais dadosPessoais;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.setDadosPessoais(new DadosPessoais(nome, cpf, cargo, salario));
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.getDadosPessoais().setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}
	
	

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

}
