package com.infoclientesback.controller;

import java.util.List;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.infoclientesback.entity.InfoCliente;
import com.infoclientesback.entity.TipoDocumento;
import com.infoclientesback.repository.InfoClienteRepository;
import com.infoclientesback.service.InfoClienteService;
import com.infoclientesback.service.TipoDocumentoService;


@RestController
@RequestMapping("/clientes")
public class InfoClienteController {

	private final Logger LOGGER = LoggerFactory.getLogger(InfoClienteController.class);
	
	@Autowired
	private InfoClienteService clienteService;
	
	@Autowired
	private InfoClienteRepository clienteRepository;
	
	@Autowired
	private TipoDocumentoService tipoService;
	/*
	@Transactional(readOnly = true)
	@GetMapping("/")
	public ResponseEntity<?> findAll(@RequestBody InfoCliente cliente){
		//LOGGER.info("Este es el objeto de cliente {}", cliente);
		List<InfoCliente> clientes =  (List<InfoCliente>) clienteRepository.findAll();
		
		return ResponseEntity.ok(clientes);
	}
	
	@GetMapping("/{numDocumento}")
	public ResponseEntity<?> findNumDocumento(@PathVariable long numDocumento){
		List<InfoCliente> clientes = (List<InfoCliente>) clienteRepository.findByNumDocumento(numDocumento);
		
		return ResponseEntity.ok(clientes);
	}
	*/
	
	@GetMapping("/{numDocumento}/{idTipo}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> findNumDocumentoAndTipo(@PathVariable long numDocumento, @PathVariable Integer idTipo){
		TipoDocumento tipo = tipoService.getClienteById(idTipo);
		
		if(numDocumento != 23445322 || idTipo > 2) {
			return new ResponseEntity<>("Número o tipo de documento no es válido", HttpStatus.NOT_FOUND);
		}else {
			return ResponseEntity.ok(clienteService.findByNumDocumentoAndTipo(numDocumento, tipo));
		}
			
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> save(@RequestBody InfoCliente cliente){
		LOGGER.info("Este es el objeto de cliente {}", cliente);
		
		InfoCliente created =  clienteService.save(cliente);
		return ResponseEntity.ok(created);
	}
	
}
