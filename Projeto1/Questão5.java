package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double digMaior, digMenor, area;
        
        System.out.print("Digite a diagonal maior: ");
        digMaior = input.nextDouble();
        
        System.out.print("Digite a diagonal menor: ");
        digMenor = input.nextDouble();
        
        area = (digMaior * digMenor) / 2;
        
        System.out.println("A area do losago e: " + area);
    }
}
