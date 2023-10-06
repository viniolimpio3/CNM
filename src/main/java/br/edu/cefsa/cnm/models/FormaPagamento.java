/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.cnm.models;

/**
 *
 * @author 081210007
 */
public class FormaPagamento {
    
    private int id;
    private String descricao;
    private Profissional profissional;

    public FormaPagamento(int id, String descricao, Profissional profissional) {
        this.id = id;
        this.descricao = descricao;
        this.profissional = profissional;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
 
    
}
