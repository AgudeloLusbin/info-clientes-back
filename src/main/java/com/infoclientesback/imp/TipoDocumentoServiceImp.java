package com.infoclientesback.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoclientesback.entity.TipoDocumento;
import com.infoclientesback.repository.TipoDocumentoRepository;
import com.infoclientesback.service.TipoDocumentoService;

@Service
public class TipoDocumentoServiceImp implements TipoDocumentoService{

	@Autowired
	TipoDocumentoRepository tipoRepository;

	@Override
	public TipoDocumento getClienteById(Integer idTipo) {
		return tipoRepository.findById(idTipo).get();
	}

}
