/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.cnm.models;

/**
 *
 * @author 081210007
 */
public class Profissional extends Usuario{

    public Profissional(int id, String nome, String telefone, String celular, String email, String senha) {
        super(id, nome, telefone, celular, email, senha);
    }
    
    

    @Override
    public boolean validaSenha(String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
