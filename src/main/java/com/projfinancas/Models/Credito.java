package com.projfinancas.Models;
import java.time.LocalDate;

public class Credito {
    private Long id;
    private String descricao;
    private LocalDate dataRef;
    private LocalDate dataPagamento;
    private double valorCredito;
    private double valorRecebido;
    private double valorDiferenca;
    private String tipoRecebimento;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataReferencia() {
        return dataRef;
    }
    public void setDataReferencia(LocalDate dataRef) {
        this.dataRef = dataRef;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorCredito() {
        return valorCredito;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }
    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double getValorDiferenca() {
        return valorDiferenca;
    }
    public void setValorDiferenca(double valorDiferenca) {
        this.valorDiferenca = valorDiferenca;
    }

    public String getTipoRecebimento() {
        return tipoRecebimento;
    }
    public void setTipoRecebimento(String tipoRecebimento) {
        this.tipoRecebimento = tipoRecebimento;
    }
}
