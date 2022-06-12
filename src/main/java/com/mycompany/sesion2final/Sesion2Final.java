/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sesion2final;

import java.util.Scanner;

/**
 *
 * @author Liliana
 */
public class Sesion2Final {

    public static void main(String[] args) {
       // System.out.println("Hello World 2!");
       
       //Ingreso de datos por teclado
       
       Scanner sc =new Scanner(System.in); //Ingresar valores por teclado
       
      /*Programacion estatica
       int num1=10;
       int num2=10;
       int Resultado =num1+num2;
       System.out.println("El resultado es : " +Resultado);*/
      
      //Suma de dos numero por teclado
       
     /* int num1;
      int num2;
      int Resultado;
      
       System.out.println("Ingrese el primer numero: ");
       num1= sc.nextInt();
       System.out.println("Ingrese el segundo numero: ");
       num2= sc.nextInt();
       Resultado= num1+num2;
       System.out.println("El resultado de la suma es: "+ Resultado);*/
       
       
       //Ingrese por teclado Nombre , Edad y Sueldo
       
       String nombre;
       int Edad;
       double Sueldo;
       String informacion;
       
       
       System.out.println("Ingresa tu nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        Edad=sc.nextInt();
         System.out.println("Ingresa tu sueldo: ");
         Sueldo=sc.nextDouble();
         
         informacion=nombre+"\n"+Edad+"\n"+Sueldo;
         System.out.println(informacion);
      
           }
}
