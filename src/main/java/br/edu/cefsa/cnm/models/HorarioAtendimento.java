/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.cnm.models;

import java.time.LocalDateTime;

/**
 *
 * @author 081210007
 */
public class HorarioAtendimento {
    
    //Construtor
    public HorarioAtendimento(int id, Profissional profissional, LocalDateTime horaInicio, LocalDateTime horaFim, String diaSemana) {
        this.id = id;
        this.profissional = profissional;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.diaSemana = diaSemana;
    }
    
    
    
    
    //Atributos
    
    private final int id;
    private final Profissional profissional;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFim;
    private String diaSemana;

    

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFim(LocalDateTime horaFim) {
        this.horaFim = horaFim;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getId() {
        return id;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public LocalDateTime getHoraFim() {
        return horaFim;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    
    
    
}
