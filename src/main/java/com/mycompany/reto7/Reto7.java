/*
John Sebastian Gomez Gonzalez y Sebastian Aristizabal
*/
package com.mycompany.reto7;

/**
 *
 * @author Sebastian
 */
public class Reto7 {

    public static void main(String[] args) {
        TramoAsfalto tramo1 = new TramoAsfalto(10, 20, 50, 80, "Argos", 80, true);
        
        TramoAsfalto tramo2 = new TramoAsfalto(50, 80, 70, 90, "Argos", 70, true);
        
        TramoSinAsfalto tramo3 = new TramoSinAsfalto(70, 90, 150, 140, "Cemex", 50, false);
        
        TramoAsfalto tramo4 = new TramoAsfalto(150, 140, 180, 190, "Argos", 85, false);
        
        TramoSinAsfalto tramo5 = new TramoSinAsfalto(180, 190, 220, 240, "AGS", 60, true);
        
        tramo1.longitud();
        
        tramo3.setTipoMaterial(1);
        
        System.out.println("Longitus tramo 1: " + tramo1.longitud());
        
        System.out.println("Area tramo 1: " + tramo1.area());
        
        System.out.println("Volumen tramo 1: " + tramo1.volumen());
        
        System.out.println("Longitus tramo 3: " + tramo3.longitud());
        
        System.out.println("Area tramo 3: " + tramo3.area());
        
        System.out.println("Volumen tramo 3: " + tramo3.volumen());
    }
}