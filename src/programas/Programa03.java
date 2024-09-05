package programas;

/*
Crear un programa en Java que permita ingresar dos mumeros y un tipo de operacion
aritmetica (+,-,*,/)
Visualizar el resultado de la operacion aritmetica

n1=4
n2=2
opa="+"
resultado=8
 */
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        //declarar variables
        double n1,n2,resultado;
        String opa;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar numero 1:");
        n1=lectura.nextDouble();
        System.out.print("Ingresar numero 2:");
        n2=lectura.nextDouble();
        System.out.print("Ingresar operacion (+,-,*,/):");
        opa=lectura.next();
        //proceso de datos
        if(opa.equals("+")){
            resultado=n1+n2;
        }else if(opa.equals("-")){
            resultado=n1-n2;
        }else if(opa.equals("*")){
            resultado=n1*n2;
        }else{
            resultado=n1/n2;
        }
        //salida de datos
        System.out.println(resultado);
    }
}    