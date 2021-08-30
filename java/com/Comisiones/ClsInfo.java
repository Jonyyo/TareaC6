/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Comisiones;

/**
 *
 * @author 7010
 */
public class ClsInfo {

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Enero
     */
    public double getEnero() {
        return Enero;
    }

    /**
     * @param Enero the Enero to set
     */
    public void setEnero(double Enero) {
        this.Enero = Enero;
    }

    /**
     * @return the Febrero
     */
    public double getFebrero() {
        return Febrero;
    }

    /**
     * @param Febrero the Febrero to set
     */
    public void setFebrero(double Febrero) {
        this.Febrero = Febrero;
    }

    /**
     * @return the Marzo
     */
    public double getMarzo() {
        return Marzo;
    }

    /**
     * @param Marzo the Marzo to set
     */
    public void setMarzo(double Marzo) {
        this.Marzo = Marzo;
    }

    /**
     * @return the VentasTotales
     */
    public double getVentasTotales() {
        return VentasTotales;
    }

    /**
     * @param VentasTotales the VentasTotales to set
     */
    public void setVentasTotales(double VentasTotales) {
        this.VentasTotales = VentasTotales;
    }

    /**
     * @return the Promedio
     */
    public double getPromedio() {
        return Promedio;
    }

    /**
     * @param Promedio the Promedio to set
     */
    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }
    
    private String Nombre;
    private double Enero;
    private double Febrero;
    private double Marzo;
    private double VentasTotales;
    private double Promedio;
    
}
