package br.com.alura.microservice.fornecedor.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.model.InforFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InforFornecedor, Long> {

    InforFornecedor findByEstado(String estado);
}
