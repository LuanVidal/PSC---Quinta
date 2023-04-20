package Projeto2;

import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int nota1, nota2, nota3, med;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextInt();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextInt();
        
        System.out.print("Digite a segunda nota: ");
        nota3 = input.nextInt();
        
        med = (nota1 + nota2 + nota3) / 3;
        
        if(med >= 0 && med < 3){
            System.out.println("Reprovado");
            
        } else if(med >= 3 && med < 7){
            System.out.println("Exame");
            
        } else if(med >=7 && med <=10){
                System.err.println("Aprovado");
                
        } else {
            System.out.println("Média Invalida");
        }
    }
}
