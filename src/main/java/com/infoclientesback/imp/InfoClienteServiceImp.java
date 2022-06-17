package com.infoclientesback.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infoclientesback.entity.InfoCliente;
import com.infoclientesback.entity.TipoDocumento;
import com.infoclientesback.repository.InfoClienteRepository;
import com.infoclientesback.service.InfoClienteService;

@Service
public class InfoClienteServiceImp implements InfoClienteService{

	@Autowired
	InfoClienteRepository clienteRepository;

	@Override
	public InfoCliente save(InfoCliente cliente) {
		cliente.setPrimerNombre("Lusbin");
		cliente.setSegundoNombre("Andres");
		cliente.setPrimerApellido("Agudelo");
		cliente.setSegundoApellido("Santamaria");
		cliente.setTelefono("3196637719");
		cliente.setDireccion("Av carrera 54");
		cliente.setCiudadResidencia("Bogota");
		return clienteRepository.save(cliente);
	}

	@Override
	public void update(InfoCliente cliente) {
		clienteRepository.save(cliente);
		
	}

	@Override
	public void delete(Integer id) {
		clienteRepository.deleteById(id);
		
	}

	@Override
	public List<InfoCliente> findByNumDocumentoAndTipo(long numDocumento, TipoDocumento tipoDocumento) {
		InfoCliente cliente = new InfoCliente();
		TipoDocumento tipo = new TipoDocumento();
		
		if(cliente.getNumDocumento() != 23445322 && (tipo.getId() != 1 || tipo.getId() != 2)) {
			ResponseEntity.badRequest();
		}
		
		return clienteRepository.findByNumDocumentoAndTipoDocumento(numDocumento, tipoDocumento);
	}

	@Override
	public List<InfoCliente> findByNumDocumento(long numDocumento) {
		return clienteRepository.findByNumDocumento(numDocumento);
	}

}
