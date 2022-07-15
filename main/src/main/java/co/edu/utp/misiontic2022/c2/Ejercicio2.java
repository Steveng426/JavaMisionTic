package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double precio_uni, Cant_Prod, iva, precio_SinIVa, total_Iva;

        System.out.print("Introduzca el precio por unidad del producto: ");
        precio_uni=scanner.nextDouble();
        System.out.print("Introduzca el numero de productos vendidos: ");
        Cant_Prod=scanner.nextDouble();
        System.out.print("Introduzca el iva: ");
        iva=scanner.nextDouble();

        precio_SinIVa = precio_uni *Cant_Prod;
        total_Iva = precio_SinIVa*iva/100;

        System.out.println("Precio de venta = "+ (precio_SinIVa+total_Iva));
    }
}
