/*
John Sebastian Gomez Gonzalez y Sebastian Aristizabal
*/
package com.mycompany.reto7;


public class TramoAsfalto extends TramoGenerico{
    private double[] coordenadas = new double[4];
    private String proveedor;
    private int velMax;
    private boolean prohibicion;
    private double resultadoLongitud;
    private double resultadoArea;
    private double resultadoVolumen;
    private final int AREA = 8;
    private final double VOL = 0.25;
    private double[] longitudes = new double[0];
    
    
    
    @Override
    public double longitud() {
        double n1 = (this.coordenadas[2]-this.coordenadas[0]);
        double n2 = (this.coordenadas[3]-this.coordenadas[1]);
        this.resultadoLongitud = Math.sqrt(((Math.pow(n1, 2))+(Math.pow(n2, 2))));
        return this.resultadoLongitud;
    }

    @Override
    public double area() {
        this.resultadoArea = this.resultadoLongitud * AREA;
        return this.resultadoArea;
    }

    @Override
    public double volumen() {
        this.resultadoVolumen = this.resultadoLongitud * AREA * VOL;
        return this.resultadoVolumen;
    }

    public TramoAsfalto(int coordenadaXi, int coordenadaYi, int coordenadaXf, int coordenadaYf, String proveedor, int velMax, boolean prohibicion) {
        this.coordenadas[0] = coordenadaXi;
        this.coordenadas[1] = coordenadaYi;
        this.coordenadas[2] = coordenadaXf;
        this.coordenadas[3] = coordenadaYf;
        this.proveedor = proveedor;
        this.velMax = velMax;
        this.prohibicion = prohibicion;
        
    }
    
}
