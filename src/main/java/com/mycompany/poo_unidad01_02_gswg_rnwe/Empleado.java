/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_unidad01_02_gswg_rnwe;

/**
 *
 * @author HP
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int añoIngreso;
    public double calcularIngresos(int añoActual){
        var retorno=100000d;
        if(this.añoIngreso<añoActual){
            retorno=(this.costoHora*this.horasTrabajadas)*((añoActual-this.añoIngreso)*0.02)+(this.costoHora*this.horasTrabajadas);
        }else{
            retorno=(this.costoHora*this.horasTrabajadas);
        }
        return retorno;      
    }
    public double calcularBonoHorasExtra(int maxHorasTrabajadas){
        var retorno= 1000000d;
        if(this.horasTrabajadas>=maxHorasTrabajadas){
            retorno=(this.horasTrabajadas-maxHorasTrabajadas)*(this.costoHora*2);
        }else{
            retorno=0;
        }
        return retorno;
    }
    public double calcularImpuesto(int limite1, int limite2, int limite3){
        var retorno=100000d;
        double r;
        r=this.costoHora*this.horasTrabajadas;
        if(r>0 && r<=limite1){
            retorno=0;
        }else{
            if(r>limite1 && r<=limite2){
                retorno=this.costoHora*this.horasTrabajadas*0.05;
            }else{
                if(r>limite2 && r<=limite3){
                    retorno=this.costoHora*this.horasTrabajadas*0.12;
                }else{
                    if(r>limite3){
                        retorno=this.costoHora*this.horasTrabajadas*0.25;
                    }
                }      
            }
        }
        return retorno;
    }
}
