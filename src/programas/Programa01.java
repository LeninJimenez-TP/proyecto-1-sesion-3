/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 Crear un programa en Java que permita ingresar cuatro numeros enteros.
 Visualizar ek numero mayor.
 */
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        int n1,n2,n3,n4,mayor;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar Numero 1:");
        n1=lectura.nextInt();
        System.out.print("Ingresar Numero 2:");
        n2=lectura.nextInt();
        System.out.print("Ingresar Numero 3:");
        n3=lectura.nextInt();
        System.out.print("Ingresar Numero 4:");
        n4=lectura.nextInt();
        //proceso de datos
        mayor=n1;
        if(n2>mayor){
            mayor=n2;
    }
        if(n3>mayor){
            mayor=n3;          
    }
        if(n4>mayor){
            mayor=n4;
    }
    //salida de datos
    System.out.println("El numero mayor es:"+mayor);
    }
}