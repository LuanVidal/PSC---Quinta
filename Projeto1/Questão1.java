package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2, nota3, med;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        
        System.out.print("\nDigite a segunda nota: ");
        nota2 = input.nextDouble();
        
        System.out.print("\nDigite a terceira nota: ");
        nota3 = input.nextDouble();
        
        med = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média é: " + med);
    }    
}
