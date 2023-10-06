/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.cnm.models;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author 081210007
 */
public class Agendamento {
    
    //Atributos
    
    private final int id;
    private final LocalDateTime dataHora;
    private final Profissional profissional;
    private final Cliente cliente;
    private final double valor;
    FormaPagamento formaPagamento;

    public List<TipoServico> getServicos() {
        return servicos;
    }
    List<TipoServico> servicos;

    public int getId() {
        return id;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public Agendamento(int id, LocalDateTime dataHora , Profissional profissional, Cliente cliente, double valor, FormaPagamento formaPagamento,List servicos) {
        this.id = id;
        this.dataHora = dataHora;
        this.profissional = profissional;
        this.cliente = cliente;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.servicos = servicos;
    }
   
    
   
    
}
