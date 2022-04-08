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
        empleado1.horasTrabajadas=100;
        empleado1.costoHora=6;
        empleado1.añoIngreso=2010;  
        System.out.println( empleado1.nombre+" | "+
                            empleado1.horasTrabajadas+" | "+
                            empleado1.costoHora+" | "+
                            empleado1.añoIngreso+" | ");
        var ingresos=empleado1.calcularIngresos(2022);
        System.out.println("El valor de ingresos es: "+ingresos);
        var bono=empleado1.calcularBonoHorasExtra(150);
        System.out.println("El valor del bono es: "+bono);
        var impuestos=empleado1.calcularImpuesto(500, 1000, 2000);
        
        var empleado2= new Empleado();
        empleado2.nombre="Marta";
        empleado2.horasTrabajadas=200;
        empleado2.costoHora=5;
        empleado2.añoIngreso=2020;  
        System.out.println( empleado2.nombre+" | "+
                            empleado2.horasTrabajadas+" | "+
                            empleado2.costoHora+" | "+
                            empleado2.añoIngreso+" | ");
        var ingresos2=empleado2.calcularIngresos(2022);
        System.out.println("El valor de ingresos es: "+ingresos2);
        var bono2=empleado2.calcularBonoHorasExtra(100);
        System.out.println("El valor del bono es: "+bono2);
        
        var empleado3= new Empleado();
        empleado3.nombre="Esteban";
        empleado3.horasTrabajadas=150;
        empleado3.costoHora=8;
        empleado3.añoIngreso=2018;  
        System.out.println( empleado3.nombre+" | "+
                            empleado3.horasTrabajadas+" | "+
                            empleado3.costoHora+" | "+
                            empleado3.añoIngreso+" | ");
        var ingresos3=empleado3.calcularIngresos(2022);
        System.out.println("El valor de ingresos es: "+ingresos3);
        var bono3=empleado3.calcularBonoHorasExtra(100);
        System.out.println("El valor del bono es: "+bono3);
        
    }
}
