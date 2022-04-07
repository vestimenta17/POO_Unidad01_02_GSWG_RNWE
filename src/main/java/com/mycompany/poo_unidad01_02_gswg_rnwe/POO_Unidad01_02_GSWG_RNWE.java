/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_unidad01_02_gswg_rnwe;

/**
 *
 * @author HP
 */
public class POO_Unidad01_02_GSWG_RNWE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        var empleado1= new Empleado();
        empleado1.nombre="Julian";
        empleado1.horasTrabajadas=2000;
        empleado1.costoHora=2;
        empleado1.añoIngreso=2022;  
        System.out.println( empleado1.nombre+" | "+
                            empleado1.horasTrabajadas+" | "+
                            empleado1.costoHora+" | "+
                            empleado1.añoIngreso+" | ");
        var ingresos=empleado1.calcularIngresos(2022);
        System.out.println("El valor de ingresos es: "+ingresos);
        var bono=empleado1.calcularBonoHorasExtra(1920);
        System.out.println("El valor del bono es: "+bono);
    }
}
