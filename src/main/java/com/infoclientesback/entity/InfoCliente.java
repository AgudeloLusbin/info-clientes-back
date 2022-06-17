package com.infoclientesback.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "infocliente")
public class InfoCliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_cliente")
	private int id;
	
	@NotNull(message = "El número de documento no puede estar vacío")
	@Column(name = "num_documento")
	private long numDocumento;
	
	@NotNull(message = "El tipo de documento no puede estar vacío")
	@ManyToOne
	@JoinColumn(name = "fk_tipo_documento")
	private TipoDocumento tipoDocumento;
	
	@NotNull(message = "El primer nombre no puede estar vacío")
	@Column(name = "primer_nombre")
	private String primerNombre;
	
	@Column(name = "segundo_nombre")
	private String segundoNombre;
	
	@NotNull(message = "El primer apellido no puede estar vacío")
	@Column(name = "primer_apellido")
	private String primerApellido;
	
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	
	@NotNull(message = "El número de telefono no puede estar vacío")
	@Column(name = "telefono")
	private String telefono;
	
	@NotNull(message = "La dirección no puede estar vacía")
	@Column(name = "direccion")
	private String direccion;
	
	@NotNull(message = "La ciudad de residencia no puede estar vacía")
	@Column(name = "ciudad_residencia")
	private String ciudadResidencia;
	
	public InfoCliente() {
		
	}

	public InfoCliente(int id, long numDocumento, TipoDocumento tipoDocumento, String primerNombre,
			String segundoNombre, String primerApellido, String segundoApellido, String telefono, String direccion,
			String ciudadResidencia) {
		super();
		this.id = id;
		this.numDocumento = numDocumento;
		this.tipoDocumento = tipoDocumento;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudadResidencia = ciudadResidencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(long numDocumento) {
		this.numDocumento = numDocumento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	@Override
	public String toString() {
		return "InfoCliente [id=" + id + ", numDocumento=" + numDocumento + ", tipoDocumento=" + tipoDocumento
				+ ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido + ", telefono=" + telefono + ", direccion="
				+ direccion + ", ciudadResidencia=" + ciudadResidencia + "]";
	}

	
	
}
