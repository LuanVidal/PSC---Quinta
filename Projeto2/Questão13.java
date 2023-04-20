package Projeto2;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Questão13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int diarias;
        double resultado, sale = 0;
        String apt;
        
        System.out.print("Digite a quatidade de diarias: ");
        diarias = input.nextInt();
        input.nextLine();
        
        System.out.print("Digite o tipo do apartamento [S]imples | [D]uplo: ");
        apt = input.nextLine();
        
        if(apt.equalsIgnoreCase("S")){
            if(diarias < 10){
                sale = 100;
                
            } else if(diarias >= 10 && diarias <= 15){
                sale = 95;
                
            } else if(diarias > 15){
                sale = 80;
            }    
            
        } else if (apt.equalsIgnoreCase("D")){
            
           if(diarias < 10){
                sale = 140;
                
            } else if(diarias >= 10 && diarias <= 15){
                sale = 120;
                
            } else if(diarias > 15){
                sale = 100;
            }    
            
        }
        
        System.out.println("\nO valor por diaria é: R$" + sale);
        
        resultado = sale * diarias;
        
        System.out.println("O valor total e: R$" + resultado);
    }
}
