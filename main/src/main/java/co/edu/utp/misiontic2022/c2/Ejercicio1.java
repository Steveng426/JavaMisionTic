package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, suerte, suma, cal1,cal2, cal3, cal4;
        
        System.out.println("Introduzca su fecha de nacimiento para obtener su dia de suerte");

        System.out.print("Dia: ");
        dia= sc.nextInt(); 
        System.out.print("Mes: ");
        mes= sc.nextInt();
        System.out.print("Año: ");
        año= sc.nextInt();
        
        suma = dia + mes + año;
        
        cal1 = suma/1000;
        cal2 = suma/100%10;
        cal3 = suma/10%10;
        cal4 = suma%10;
        
        suerte = cal1 + cal2 + cal3+ cal4;
        System.out.println("Su numero de la suerte es: "+ suerte);
    }
}
