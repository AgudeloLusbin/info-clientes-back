package com.infoclientesback.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infoclientesback.entity.InfoCliente;
import com.infoclientesback.entity.TipoDocumento;

@Repository
public interface InfoClienteRepository extends CrudRepository<InfoCliente, Integer>{
 public List<InfoCliente> findByNumDocumento(long numDocumento);
 public List<InfoCliente> findByNumDocumentoAndTipoDocumento(long numDocumento, TipoDocumento tipoDocumento);
}
