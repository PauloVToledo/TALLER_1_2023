package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Probando primer commit de main");

        mostrarletras();
        verificarEdad();
    }

    public static void mostrarletras(){
        System.out.println("muestras del primer commit parte 1.");

    }

    public static boolean verificarEdad() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa de nuevo tu edad");
        int edad= sc.nextInt();

        System.out.println("Ingrese su edad");
        if (edad > 20) {
            System.out.println("Usted es adulto \n");
            System.out.println();
            return true;

        }

        return false;
    }
}

//Estoy practicando en java un par de cosas.

