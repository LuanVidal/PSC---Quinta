package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int idade, idade2050 ,anoAtual, anoNacimento;
        
        System.out.print("Digite seu ano de nacimento: ");
        anoNacimento = input.nextInt();
        
        System.out.print("Digite o ano atual: ");
        anoAtual = input.nextInt();
        
        idade = anoAtual - anoNacimento;
        idade2050 = 2050 - anoNacimento;
        
        System.out.println("A idade atual e: " + idade);
        System.out.println("A Idade em 2050 e: " + idade2050);
    }
}
