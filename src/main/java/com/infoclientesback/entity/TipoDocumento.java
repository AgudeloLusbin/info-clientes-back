package com.infoclientesback.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TipoDocumento implements Serializable{
 
	@Id
	@Column(name = "pk_tipo_documento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "desc_documento")
	private String descDocumento;

	public TipoDocumento() {
		
	}
	
	public TipoDocumento(int id, String descDocumento) {
		super();
		this.id = id;
		this.descDocumento = descDocumento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescDocumento() {
		return descDocumento;
	}

	public void setDescDocumento(String descDocumento) {
		this.descDocumento = descDocumento;
	}

	@Override
	public String toString() {
		return "TipoDocumento [id=" + id + ", descDocumento=" + descDocumento + "]";
	}
	
	
}
