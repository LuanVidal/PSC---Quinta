package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número: ");
        numero = entrada.nextInt();

        System.out.println("Tabuada de multiplicação do número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
           int resultado = numero * i;
           System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
