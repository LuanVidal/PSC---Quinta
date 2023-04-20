package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double salario, ajuste, aumento;
        
        System.out.print("Digite seu salario: ");
        salario = input.nextDouble();
        
        aumento = salario * 0.25;
        
        ajuste = salario + aumento;
        
        System.out.println("\nO salario com reajuste é: R$ " + ajuste);
    }
}
