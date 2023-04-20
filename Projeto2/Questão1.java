package Projeto2;

import java.util.Scanner;

public class Questão1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2, med;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        
        med = (nota1 + nota2) / 2; 
        
        if (med >= 7){
            System.out.println("Aprovado");
        
        } else {
        
            System.out.println("Reprovado");
        }
        
    }
}
