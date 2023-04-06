package br.com.alura.microservice.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.model.InforFornecedor;
import br.com.alura.microservice.fornecedor.services.InforService;

@RestController
@RequestMapping("/info")
public class InforController {

    @Autowired
    private InforService inforService;
    
    @RequestMapping("/{estado}")
    public InforFornecedor getInforPorEstado(@PathVariable String estado) {
        return inforService.getInfoPorEstado(estado);
    }
}
