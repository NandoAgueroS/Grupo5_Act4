/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package TP4_ING_Grupo5;

/**
 *
 * @author Lenovo
 */
public class TP4 {
 
    public static void main(String[] args) 
    {
        Auto cascajo = new Auto("123LATA","Renault 12");
        Auto fordFocus = new Auto("999POWR", "Ford Focus");
        Celular celular = new Celular("Movistar", 255306249, 100.0);
        Padre papa = new Padre(cascajo);
        Hijo juanCarlos = new Hijo("Juan Carlos", celular, cascajo);
        
        System.out.println("Papá me dejó esta casa en zona: " + papa.getCasa().getZona());
        
        System.out.println("Soy el hijo " + juanCarlos.getNombre() + " herede de mi padre su apellido: " + juanCarlos.getApellido());
        
        System.out.println("Papá me dejó este auto: " + juanCarlos.getAuto().getModelo());
        
        juanCarlos.conducirAuto(fordFocus);

        juanCarlos.jugarFutbol();
        
        juanCarlos.bailar();
        
        System.out.println("SALIO EL NUMERO DE LA SUERTE " + juanCarlos.jugarLoteria());
        
        juanCarlos.cantar();
        
        juanCarlos.heredarDinero(2000);
        
        System.out.println("Jugando al Futbol. Hoy has hecho " + juanCarlos.hacerGoles() + " goles.");
    }
}
