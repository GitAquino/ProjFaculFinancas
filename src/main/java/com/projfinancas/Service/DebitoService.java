package com.projfinancas.Service;

import com.projfinancas.Models.Debito;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DebitoService {

    private List<Debito> listaDebitos = new ArrayList<>();
    private static Long proximoId = 1L;

    public Debito criarDebito(Debito debito) {
        debito.setId(proximoId);
        proximoId++;
        listaDebitos.add(debito);
        return debito;
    }
    public List<Debito> getAllDebitos(){
        return listaDebitos;
    }

    public Debito getDebitoById(Long id) {
        // Simples busca por ID na lista de débitos
        for (Debito debito : listaDebitos) {
            if (debito.getId().equals(id)) {
                return debito;
            }
        }
        return null;
    }

    public Debito criarNovoDebito(Debito novoDebito) {
        listaDebitos.add(novoDebito);
        return novoDebito;
    }

}
