package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double peso, engorda, emagrece, porctEng, porcentEmag;
        
        System.out.print("Digite seu peso: ");
        peso = input.nextDouble();
        
        porctEng = peso * 0.15;
        porcentEmag = peso * 0.20;
        
        engorda = peso + porctEng;
        emagrece = peso - porcentEmag;
        
        System.out.print("Seu peso se você engordar 15%: " + engorda);
        System.out.print("\nSeu peso se vôce emagrecer 20%: " + emagrece);
    }
}
