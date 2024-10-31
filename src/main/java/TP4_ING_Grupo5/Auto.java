/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4_ING_Grupo5;

/**
 *
 * @author Lenovo
 */
public class Auto {
    
    private String patente;
    private String modelo;
    private double combustible;


    public Auto(String patente, String modelo) 
    {
        this.patente = patente;
        this.modelo = modelo;
        this.combustible = 50;
    }

    public String getPatente() 
    {
        return patente;
    }
    
    public String getModelo() 
    {
        return modelo;
    }
}
