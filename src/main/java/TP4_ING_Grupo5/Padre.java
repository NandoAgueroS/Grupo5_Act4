
package TP4_ING_Grupo5;

public class Padre {
    
    private String nombre;
    private String apellido;
    private Casa casa;
    private Auto auto;

    public Padre(Auto auto) 
    {
        this.nombre = "Papa";
        this.apellido = "Lopez";
        construirCasa();
        comprarAuto(auto);
    }

    public String getApellido() 
    {
        return apellido;
    }
    
    public void construirCasa() 
    {
        this.casa = new Casa("centro, (2) pisos");
    }
    
    public void comprarAuto(Auto auto)
    {
        this.auto = auto;
    }
    
    public void cantar()
    {
        System.out.print("Así canta tu padre, Don " + this.apellido);
    }

    public Casa getCasa() 
    {
        return casa;
    }

    public Auto getAuto() 
    {
        return auto;
    }


}