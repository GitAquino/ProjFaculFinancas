package com.projfinancas.Models;

import java.time.LocalDate;

public class Debito {
    private Long id;
    private String descricao;
    private LocalDate dataRef;
    private LocalDate dataPagamento;
    private double valorDebito;
    private double valorPago;
    private double valorDiferenca;
    private TipoDespesa  tipoDespesa;


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

    public double getValorDebito() {
        return valorDebito;
    }
    public void setValorDebito(double valorDebito) {
        this.valorDebito = valorDebito;
    }

    public double getValorPago() {
        return valorPago;
    }
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorDiferenca() {
        return valorDiferenca;
    }
    public void setValorDiferenca(double valorDiferenca) {
        this.valorDiferenca = valorDiferenca;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }
    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }
}