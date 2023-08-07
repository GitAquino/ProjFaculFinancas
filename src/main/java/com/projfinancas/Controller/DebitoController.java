package com.projfinancas.Controller;

import com.projfinancas.Models.Debito;
import com.projfinancas.Models.TipoDespesa;
import com.projfinancas.Service.DebitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.List;

@RestController
@RequestMapping("/api/debitos")

public class DebitoController {

    @Autowired
    private DebitoService debitoService;

    @GetMapping
    public List<Debito> getAllDebitos() {
        return debitoService.getAllDebitos();
    }

    @GetMapping("/{id}")
    public Debito getDebitoById(@PathVariable Long id) {
        return debitoService.getDebitoById(id);
    }

    @PostMapping("/novo")
    public ResponseEntity<Debito> criarDebito(@RequestBody Debito debito) {
        TipoDespesa tipoDespesa = debito.getTipoDespesa();
        // Aqui você pode acessar o id do tipo de despesa
        Long tipoDespesaId = tipoDespesa.getId();

        // Chame o serviço para criar o débito
        Debito novoDebito = debitoService.criarDebito(debito);

        // Retorne a resposta adequada, por exemplo:
        return ResponseEntity.status(HttpStatus.CREATED).body(novoDebito);
    }

}