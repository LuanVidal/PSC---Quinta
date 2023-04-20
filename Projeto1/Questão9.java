package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double catetoOps, catetoAdj, hipt, sum;
        
        System.out.print("Digite o cateto oposto: ");
        catetoOps = input.nextDouble();
        
        System.out.print("Digite o cateto adjacente: ");
        catetoAdj = input.nextDouble();
        
        sum = Math.pow(catetoAdj,2) + Math.pow(catetoOps,2);
        
        hipt = Math.sqrt(sum);
        
        System.out.println("A hipotenusa é: " + hipt);
    }
}
