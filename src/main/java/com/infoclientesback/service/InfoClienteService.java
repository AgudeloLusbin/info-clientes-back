package com.infoclientesback.service;

import java.util.List;

import com.infoclientesback.entity.InfoCliente;
import com.infoclientesback.entity.TipoDocumento;

public interface InfoClienteService{

	public InfoCliente save(InfoCliente cliente);
	public void update(InfoCliente cliente);
	public void delete(Integer id);
	public List<InfoCliente> findByNumDocumento(long numDocumento);
	public List<InfoCliente> findByNumDocumentoAndTipo(long numDocumento, TipoDocumento tipo);
}
