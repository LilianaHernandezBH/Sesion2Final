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
       
      /* String nombre;
       int Edad;
       double Sueldo;
       String informacion;
       
       
       System.out.println("Ingresa tu nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        Edad=sc.nextInt();
         System.out.println("Ingresa tu sueldo: ");
         Sueldo=sc.nextDouble();
         
          System.out.println("Ingresa tu sueldo: ");
        informacion=nombre+"\n"+Edad+"\n"+Sueldo;
        System.out.println(informacion);*/
        
        System.out.println("-------->u<------");
         
         //Condicionales
         
            //1.Condicionales IF
         
          /*  if (10>5) {
            System.out.println("10 es mayor a 5");
        }
            int condicionalNum1=10;
            int condicionalNum2=8;
             if (condicionalNum1>condicionalNum2) {
                 System.out.println("10 es mayor a 8");
            
        }
             System.out.println("-------->u<------");
             //Condicionales if-else
          
           int edad=15;
           if(edad<18){
               System.out.println("Usted es menor de edad");
           }
           else{
               System.out.println("Usted es mayor de edad");
           }
           
          // System.out.println("-------->u<------");
            
           //Condicionales anidadas
         int hora=11;
         if (hora<=10) {
             System.out.println("Es de mañana");
            
        }
         else if(hora==12){
             System.out.println("Es de mañana");
         }
         else{
             System.out.println("Es de noche");
         }
         
         
        //Utilizando condiciones  operadores ternarios solo funciona con el if y else 
         
         int edad2=20;
         String  ResultadoEdad=(edad2<18)? "Menor de Edad": "Mayor de edad";
         System.out.println(ResultadoEdad);
         
         System.out.println("-------->u<------");
         
         //Switch case 
         
         int diaSemana=8;
         
         switch(diaSemana){
             case 1: System.out.println("Lunes");
                     break;
             case 2: System.out.println("Martes");
                     break;
             case 3: System.out.println("Miercoles");
                     break;
             case 4: System.out.println("Jueves");
                     break;
             case 5: System.out.println("Viernes");
                     break;
             case 6: System.out.println("Sabado");
                     break;
             case 7: System.out.println("Domingo");
                     break;
             default: System.out.println("No hay  dia que ingreso");                          
    }
          
          //Ciclos infinitos while
          int contadorWhile=0;
          
          //Se ejecutara siempre y cuando la condicon sea Verdadera
        
          while (contadorWhile<10) {   
              System.out.println(contadorWhile); //Muestra lo que contiene la variable
              contadorWhile++;
            
        }
          
          //Condicion do-while
          
          int contadorDoWhile=0;
          
          do { 
              System.out.println(contadorDoWhile);
              contadorDoWhile++;          
        } while (contadorDoWhile<5);
          
          
          //Ciclos finitos for
          int i;
          for (i=0;i<5;i++) {
           System.out.println(i);
        }
          // for each nos sirve para recorrer arreglos, vectores, matrices
          
          String[] AlumnosForEach={"Frank","Liliana","Claudio","Vinicio"};
          //Mostrar todos los registros
          for(String iForEach:AlumnosForEach){
              System.out.println(iForEach);
          }
          //Matrices unidimencionales
           String [] matrizAutos= {"Toyota","BMW","Ford"};
            
             int [] matrizNumeros={10,11,12,13,14,15};
             
             //Mostrando valores de la matriz por posiciones
             
           System.out.println(matrizAutos[1]);
           
           //Cambiando de valor de elemento de matriz
           
           matrizAutos[1]="Subaru";
           System.out.println(matrizAutos[1]);
               for(String iForEach:matrizAutos){
              System.out.println(iForEach);*/
         
              //MAtrices Multidimensionales
              int [][] matrizMultidimensional={{1,2,3,4},{5,6,7,8}};
              
              int misElementos=matrizMultidimensional[1][2];
              System.out.println(misElementos);
              
              //Mostrando todos los datos de mis matrices Multidimensional
             
           for (int i2 = 0; i2 < matrizMultidimensional.length; i2++) {
              //  System.out.println("\n");
               for (int j2 = 0; j2 <  matrizMultidimensional.length; j2++) {
                   System.out.println(matrizMultidimensional[i2][j2]);
                   
               }
           
        }
    }
}
