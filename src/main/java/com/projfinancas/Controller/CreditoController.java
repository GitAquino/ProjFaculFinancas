package com.projfinancas.Controller;

import com.projfinancas.Models.Credito;
import com.projfinancas.Service.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/creditos")

public class CreditoController {

    @Autowired
    private CreditoService creditoService;

    @GetMapping
    public List<Credito> getAllCreditos(){
        return creditoService.getAllCreditos();
    }

    //adicionar os metodos do crud (get,post,delete,etc...)

}
