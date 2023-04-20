package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salario, minSalario, qnt;
        
        System.out.print("Digite o salario mínimo: ");
        minSalario = input.nextDouble();
        
        System.out.print("Digite seu salario: ");
        salario = input.nextDouble();
        
        qnt = salario / minSalario;
        
        System.out.print("\n Quantos salarios minimos seu salario representa: " + qnt);
                       
    }
}
