/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.cnm.models;

/**
 *
 * @author 081210007
 */
public class TipoServico {
    
    private final int id;
    private String descricao;
    private double valor;

    public int getId() {
        return id;
    }

    public String getNome() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public TipoServico(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
