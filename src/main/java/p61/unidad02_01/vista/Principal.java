/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01.vista;

import p61.unidad02_01.*;
import p61.unidad02_01.Modelo.Atencion;
import p61.unidad02_01.Modelo.Dueño;
import p61.unidad02_01.Modelo.Mascota;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
       
        var mauricio = new Dueño("0103667754","Mauricio Ortiz",3,2);
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti",0);
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa",1);
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa",2);
        
        var mascot = new Mascota("Mauricio","Perro","Golden",5.9,mauricio);
        
        var atencionnum1=new Atencion("Juan", 20,mascot, 5);
        atencionnum1.recetas("Perrorab",10,"1 cada 6 horas",0);
        atencionnum1.recetas("RKs",5,"5 cada 2 horas",1);
        atencionnum1.recetas("Perrofin",3,"3 cada 24 horas",2);
        atencionnum1.recetas("Sinovac",8,"1 cada 34 horas",3);
        atencionnum1.recetas("Matlabh",9,"2 cada 80 horas",4);
        
       System.out.println(atencionnum1.toString()+"\n");
       System.out.println(mauricio.toString());
    }
    
}
