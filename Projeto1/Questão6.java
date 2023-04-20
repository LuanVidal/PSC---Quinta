package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double celsius, fahrenheit;
        
        System.out.print("Digite a temperatura em Celsius: ");
        celsius = input.nextDouble();
        
        fahrenheit = (celsius * 1.8) + 32;
        
        System.out.println("Resultado em fahrenheit: " + fahrenheit);
    }
}
