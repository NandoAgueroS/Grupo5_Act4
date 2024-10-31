/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4_ING_Grupo5;

/**
 *
 * @author Lenovo
 */
public class Hijo extends Padre implements Madre, Tio, Hermano{
    
    private String nombre;
    private double billetera;
    private Celular telefono;
    private String apellido;

    public Hijo(String nombre, Celular telefono, Auto auto) 
    {
        super(auto);
        this.nombre = nombre;
        this.telefono = telefono;
        this.apellido = super.getApellido();
    }

    public double getBilletera() 
    {
        return billetera;
    }

    public String getNombre() 
    {
        return nombre;
    }
    
    public void conducirAuto(Auto auto) 
    {
        System.out.println("Conduciendo un auto de un amigo: " + auto.getModelo() + ", patente " + auto.getPatente());
    }
    
    @Override
    public void cantar() 
    {
        super.cantar(); 
        System.out.println(" Y así canta Juan Carlos.");
    }
    
    @Override
    public void bailar() 
    {
        System.out.println("Sé bailar como mi madre ♪ ♫ ♪");
    }

    @Override
    public int jugarLoteria() 
    {
        System.out.print("Heredaste la fortuna de " + Madre.fortuna + " de tu madre La Rosa!!");
        this.billetera += Madre.fortuna;
        System.out.println("Ahora tienes " + this.billetera + "U$S !!");
        return Madre.NROSUERTE;
    }

    @Override
    public void heredarDinero(double dinero) 
    {
        System.out.print("MSJ de tio Lucas: disfruta de la herencia Addams,");
        this.billetera += dinero;
        System.out.println(" sumas " + this.billetera + " dolaritos.");
    }

    @Override
    public void jugarFutbol() 
    {
        System.out.println("Sé jugar fútbol gracias a mi hermano.");
    }

    @Override
    public int hacerGoles() 
    {
        return 0;
    }
    
    
}
