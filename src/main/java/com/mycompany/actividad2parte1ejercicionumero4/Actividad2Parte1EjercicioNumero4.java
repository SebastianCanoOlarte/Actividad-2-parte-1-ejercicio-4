/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero4;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero4 {

    public static void main(String[] args) {
        double a,b;
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba  numero A");
        a = leer.nextDouble();
        System.out.println("escriba numero B");
        b = leer.nextDouble();
        if (a>b){
        System.out.println("A es mayor que B");
        }
        else if(a==b){
        System.out.println("A es igual a B");
        }
        else{
        System.out.println("A es menor que B");
        }
    }
}
