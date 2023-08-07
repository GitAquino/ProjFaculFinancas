package com.projfinancas.Service;

import com.projfinancas.Controller.CreditoController;
import com.projfinancas.Models.Credito;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class CreditoService {

    private List<Credito> creditos = new ArrayList<>();

    public List<Credito> getAllCreditos() {
        return creditos;
    }

    //Implementar metodos do crud

}
