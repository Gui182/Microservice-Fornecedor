package br.com.alura.microservice.fornecedor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.InforFornecedor;

@Service
public class InforService {

    @Autowired
    private InfoRepository infoRepository;

    public InforFornecedor getInfoPorEstado(String estado) {

       return infoRepository.findByEstado(estado);
    }
    
}
