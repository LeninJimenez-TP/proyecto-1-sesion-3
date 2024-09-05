/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/*
 Crear un programa en java que permita ingresar las 3 notas de un alumno 
 visulaizar el promedio y la condicion
 
 >=a<12probado
 <12 Desaprobado
 */
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        //declarar variables
        double nota1,nota2,nota3,promedio;
        String alumno,condicion;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar nombre del alumno:");
        alumno=lectura.next();
        System.out.print("Ingresar nota 1:");
        nota1=lectura.nextInt();
        System.out.print("Ingresar nota 2:");
        nota2=lectura.nextInt();
        System.out.print("Ingresar nota 3:");
        nota3=lectura.nextInt();
        //proceso de datos
        promedio=(nota1+nota2+nota3)/3;
        if(promedio>=12){
            condicion="Aprobado";
        }else{
            condicion="Desaprobado";
        }  
        //salida de datos
        System.out.println("El promedio es:"+promedio);
        System.out.println("La condicion es:"+condicion);
         
            
    }
        
    }
