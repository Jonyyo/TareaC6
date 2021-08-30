/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea6;

import com.Comisiones.ClsProComisiones;
import java.util.Scanner;

/**
 *
 * @author 7010
 */
public class ClsMenuPrincipal {
        ClsProComisiones UCP=new ClsProComisiones();
    //Metodo que Contieneel Menu y Funciones del Programa.
    public void Menu(){
    Scanner Lector=new Scanner(System.in);
        String opcion="";
        int opcion2=0;
        
        do {
        System.out.println("\n*****MENU PRINCIPAL*****");
        System.out.println("[1]-Ingreso de Informacion\n"
                + "[2]-Consulta quien Vendio Mas y Menos X mes\n"
                + "[3]-Consulta quien Vendio Mas en los Tres Meses\n"
                + "[4]-Editar Datos\n"
                + "[5]-Busquedad de Informacion\n"
                + "[6]-Consultar Datos\n"
                + "[7]-Salir");
        System.out.println("Cual es la Opcion: "); opcion=Lector.nextLine();
        
        switch(opcion){
            case "1":
                UCP.RegistraInformacion();
                UCP.Calculos();
                break;
            case "2":
                UCP.VentaMayorxMes();
                System.out.println("\n");
                UCP.VentaMenorxMes();
                break;
            case "3":
                UCP.VentaMayor();
                break;
            case "4":
                UCP.ModificarRegistro();
                break;
            case "5":
                    UCP.Buscar();
                break;
            case "6":
                UCP.ImprimirInformacion();
                break;
          }
        } while(!opcion.equals("7"));
        
        System.out.println("Esta Seguro que Desea Salir\n"
                + "[1] Salir del Programa\n"
                + "[2] Volver a Menu Principal");
        System.out.println("Opcion: "); opcion2=Lector.nextInt();
         
        if (opcion2==1) {
            System.exit(0);
        }
        if (opcion2==2) {
            Menu();
        }
    }
}
