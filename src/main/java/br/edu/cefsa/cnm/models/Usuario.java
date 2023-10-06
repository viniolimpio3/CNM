/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.cnm.models;

/**
 *
 * @author 081210007
 */
public abstract class Usuario {

    // Construtor 
    public Usuario(int id, String nome, String telefone, String celular, String email, String senha) {
        
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
        this.celular = celular;
        this.email = email;
        this.senha = senha;
    }

    
    //Get dos atributos 
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }
    
    
    // SET dos atributos
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    //Atributos
    public void setEmail(String email) {
        this.email = email;
    }
    private int id;
    private String nome;
    private String telefone;
    private String celular;
    private String email;
    private String senha;
    
    
    //método para validar a senha 
    public abstract boolean validaSenha(String senha);
    
    
}
