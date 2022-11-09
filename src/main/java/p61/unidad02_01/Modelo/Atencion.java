/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01.Modelo;

import p61.unidad02_01.*;

/**
 *
 * @author LAB-2
 */
public class Atencion {

  private String Veterinario;
  private double costo;
  private Mascota mascota;
  private int cantidadRecetas;
  private Receta[] resetini;

    public Atencion(String Veterinario, double costo, Mascota mascota, int cantidadRecetasl) {
        this.Veterinario = Veterinario;
        this.costo = costo;
        this.mascota = mascota;
        this.cantidadRecetas = cantidadRecetasl;
        this.resetini = new Receta[ cantidadRecetasl];

    }
    public void recetas(String medicamento, int cantidad, String indicacion,int posicion){
    var recetas=new Receta(medicamento,cantidad,indicacion);
    this.resetini[posicion]=recetas;}

    

    public Receta[] getResetini() {
        return resetini;
    }

    public void setResetini(Receta[] resetini) {
        this.resetini = resetini;
    }

  

    public String getVeterinario() {
        return Veterinario;
    }

    public void setVeterinario(String Veterinario) {
        this.Veterinario = Veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getCantidadRecetasl() {
        return cantidadRecetas;
    }

    public void setCantidadRecetasl(int cantidadRecetasl) {
        this.cantidadRecetas = cantidadRecetasl;
    }
         
    public Receta[] getRecetalist() {
        return resetini;
    }

    public void setRecetalist(Receta[] recetalist) {
        this.resetini = recetalist;
    
    
  
    
}

    public String toString() {
        var retorno= "Atencion{" + "Veterinario=" + Veterinario + ", costo=" + costo + ", mascota=" + mascota + ","+ "cantidadRecetas=" + cantidadRecetas +"\n";
        for(var rezeta:this.resetini){
            retorno+=rezeta.toString()+"\n";
    }
        return retorno;
}
}
