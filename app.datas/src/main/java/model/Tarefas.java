package model;


import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity   // criando a tabela
public class Tarefas {
	
	@GeneratedValue
	@Column
	@Id
	private int id;
	
	
	@Column (nullable = false)
	private String tarefa;
	
	@Temporal (TemporalType.TIMESTAMP)
	private Calendar criadoecriatedAt;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public Calendar getCriadoecriatedAt() {
		return criadoecriatedAt;
	}

	public void setCriadoecriatedAt(Calendar criadoecriatedAt) {
		this.criadoecriatedAt = criadoecriatedAt;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	

}
