/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Comisiones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 7010
 */
public class ClsProComisiones {
    Scanner Lector=new Scanner(System.in);
    public List<ClsInfo> Comisiones =new ArrayList<ClsInfo>();
    
    double SumaEnero,sumaFebrero,SumaMarzo;
    
    //Metodo para Registrar Informacion.
    public ClsInfo RegistraInformacion(){
        ClsInfo CI=new ClsInfo(); 
        System.out.println("Cuantas Personas quiere ingresar: ");
        int cant=Lector.nextInt();
        for (int i = 0; i <cant; i++) {
            System.out.println("INGRESE INFORMACION CLIENTE "+(i+1));
            System.out.println("Ingrese el Nombre:");
            CI.setNombre(Lector.nextLine());
            CI.setNombre(Lector.nextLine());
            System.out.println("Ingrese Ventas Enero:");
            CI.setEnero(Lector.nextDouble());
            System.out.println("Ingrese Ventas Febrero:");
            CI.setFebrero(Lector.nextDouble());
            System.out.println("Ingrese Ventas Marzo:");
            CI.setMarzo(Lector.nextDouble());
            Comisiones.add(CI);
            CI=new ClsInfo();
            System.out.println("CLIENTE REGISTRADO");
        }
        return CI;
    
    }
    //Funcion que Calcula los Totales y Promedios;
    public void Calculos(){
        SumaEnero=0.0;sumaFebrero=0.0;SumaMarzo=0.0;
        for (ClsInfo Xs : Comisiones) {
             SumaEnero+=Xs.getEnero();
             sumaFebrero+=Xs.getFebrero();
             SumaMarzo+=Xs.getMarzo();
             Xs.setVentasTotales(Xs.getEnero() + Xs.getFebrero() + Xs.getMarzo());
             Xs.setPromedio(Xs.getVentasTotales() / 3);
             Xs=new ClsInfo();
        }
    }
    //Metodo para Imprimir la Informacion
    public void ImprimirInformacion(){
        System.out.println("\n---NOMBRE---ENERO---FEBRERO---MARZO---TOTAL---PROMEDIO");
        for(ClsInfo Xs :Comisiones){
            System.out.println("---"+Xs.getNombre()+"---Q"+Xs.getEnero()+"---Q"+Xs.getFebrero()+"---Q"+Xs.getMarzo()+"---Q"+Xs.getVentasTotales()+"--Q"+Xs.getPromedio());     
        }
        System.out.println("\nLas Ventas Totales por Meses son las Siguientes:");
        System.out.println("Enero: Q"+SumaEnero);
        System.out.println("Febrero: Q"+sumaFebrero);
        System.out.println("Marzo: Q"+SumaMarzo+"\n");
    }
    //Metodo para encontrar la venta mayor x mes.
    public void VentaMayorxMes(){
         String NME="",NMF="",NMM="";
         Double nme=0.0,nmf=0.0,nmm=0.0;
         for (ClsInfo Xs : Comisiones) {
             
             if (nme <Xs.getEnero()) {
                 nme=Xs.getEnero();
                 NME=Xs.getNombre();
             }
             if (nmf <Xs.getFebrero()) {
                 nmf=Xs.getFebrero();
                 NMF=Xs.getNombre();
             }
             if (nmm <Xs.getMarzo()) {
                 nmm=Xs.getMarzo();
                 NMM=Xs.getNombre();
             }
         }
         System.out.println("La Persona que vendio mas en Enero es: "+NME+" la cantidad de Q"+nme);
         System.out.println("La Persona que vendio mas en Febrero es: "+NMF+" la cantidad de Q"+nmf);
         System.out.println("La Persona que vendio mas en Marzo es: "+NMM+" la cantidad de Q"+nmm);   
     }
    //Metodo para encontrar la venta menor x mes.
    public void VentaMenorxMes(){
        String NME="",NMF="",NMM="";
         Double nme=1000000000000.0,nmf=1000000000000.0,nmm=1000000000000.0;
         for (ClsInfo Xs : Comisiones) {
             if (nme >Xs.getEnero()) {
                 nme=Xs.getEnero();
                 NME=Xs.getNombre();
             }
             if (nmf >Xs.getFebrero()) {
                 nmf=Xs.getFebrero();
                 NMF=Xs.getNombre();
             }
             if (nmm >Xs.getMarzo()) {
                 nmm=Xs.getMarzo();
                 NMM=Xs.getNombre();
             }
         }
         System.out.println("La Persona que vendio menos en Enero es: "+NME+" la cantidad de Q"+nme);
         System.out.println("La Persona que vendio menos en Febrero es: "+NMF+" la cantidad de Q"+nmf);
         System.out.println("La Persona que vendio menis en Marzo es: "+NMM+" la cantidad de Q"+nmm);
    }
    //Metodo para encontrar el Total Mayor.
    public void VentaMayor(){
        String Mayor="";
        Double NumMayor=0.0;
        for(ClsInfo Xs: Comisiones){
            if (NumMayor<Xs.getVentasTotales()) {
                NumMayor=Xs.getVentasTotales();
                Mayor=Xs.getNombre();
                
            }
        }
        System.out.println("La persona que Vendio mas en los 3 Meses es: "+Mayor+" la cantidad de: Q"+NumMayor);
    }
    //Metodo para Modificar Nombre o Cantidad Vendida en algun Mes y recalcula los Datos.
    public void ModificarRegistro(){
        int eleccion=0,acumulador=0,indice=0,eleccion2=0;
        String Name="";
        double NuevaCant=0.0;
        
        System.out.println("Desea Modificar un Nombre o una Cantidad?\n"
                + "{1} -> Modificar Nombre\n"
                + "{2} -> Modificar Cantidad");
        eleccion=Lector.nextInt();
        
        if (eleccion==1) {
            System.out.println("Cual es el Nombre que Deseas Modificar: ");
            for (ClsInfo Xs : Comisiones) {
                System.out.println("Indice: "+acumulador+" = "+Xs.getNombre());
                acumulador++;
            }
            System.out.println("Cual es el indice del Nombre que quiere Modificar: ");
            indice=Lector.nextInt();
            System.out.println("Cual es nuevo Nombre a Ingresar: ");
            Name=Lector.nextLine();
            Name=Lector.nextLine();
            Comisiones.get(indice).setNombre(Name);
            System.out.println("****CAMBIO REALIZADO****");
            
        }
        
        if (eleccion==2) {
            System.out.println("Cual es el Mes donde se encuentra la cantidad a Modificar: \n"
                    + "{1}->Enero\n"
                    + "{2}->Febrero\n"
                    + "{3}->Marzo");
            eleccion2=Lector.nextInt();
            if (eleccion2==1) {
                for(ClsInfo Xs: Comisiones){
                    System.out.println("Indice: "+acumulador+" = "+Xs.getEnero()+" Pertenece al Cliente: "+Xs.getNombre());
                    acumulador++;
                }
            System.out.println("Cual es el indice de la cantidad de Enero que quiere Modificar: ");
            indice=Lector.nextInt();
            System.out.println("Cual es la nueva cantidad a Ingresar");
            NuevaCant=Lector.nextDouble();
            Comisiones.get(indice).setEnero(NuevaCant);
                
            }
            if (eleccion2==2) {
               for(ClsInfo Xs: Comisiones){
                   System.out.println("Indice: "+acumulador+" = "+Xs.getFebrero()+" Pertenece al Cliente: "+Xs.getNombre());
                    acumulador++; 
                } 
           System.out.println("Cual es el indice de la cantidad de Febrero que quiere Modificar: ");
            indice=Lector.nextInt();
            System.out.println("Cual es la nueva cantidad a Ingresar");
            NuevaCant=Lector.nextDouble();
            Comisiones.get(indice).setFebrero(NuevaCant);
            }
            if (eleccion2==3) {
                for(ClsInfo Xs: Comisiones){
                   System.out.println("Indice: "+acumulador+" = "+Xs.getMarzo()+" Pertenece al Cliente: "+Xs.getNombre());
                    acumulador++; 
                }
            System.out.println("Cual es el indice de la cantidad de Marzo que quiere Modificar: ");
            indice=Lector.nextInt();
            System.out.println("Cual es la nueva cantidad a Ingresar");
            NuevaCant=Lector.nextDouble();
            Comisiones.get(indice).setMarzo(NuevaCant);
            }
            Calculos();
            System.out.println("****CAMBIO REALIZADO****");
            
            
            
            
            
        }
        
        
        

        
    }
    //Metodo para Buscar por Cantidad
    public void Buscar(){
        String Nombre="",Mes="";
        Double Busqueda=0.0;
        System.out.println("Cuanto es la cantidad que vendio la persona? ");
        Busqueda=Lector.nextDouble();
        for (ClsInfo Xs : Comisiones) {
             
            if(Xs.getEnero()==Busqueda){
                Mes="Enero";
                Nombre=Xs.getNombre();
            }
            
            if(Xs.getFebrero()==Busqueda){
                Mes="Febrero";
                Nombre=Xs.getNombre();
            }
            
            if(Xs.getMarzo()==Busqueda){
                Mes="Marzo";
                Nombre=Xs.getNombre();
            }
            
        }
        System.out.println("El resultado de la Busqueda es: ");
        System.out.println("Nombre de la Persona: "+Nombre);
        System.out.println("El mes que se realizo la venta es: "+Mes);
    }
    
    
}
