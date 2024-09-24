package com.matera.blog.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Funcionario implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	private Double salario;

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
