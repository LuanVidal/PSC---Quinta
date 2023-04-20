package Projeto2;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Questão11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int diaria;
        double  resultado = 0;
        
        System.out.println("Digite o número de diárias:");
        diaria = input.nextInt();
        
        if(diaria < 15){
            resultado = (500 * diaria) + (15 * diaria);
            
        } else if(diaria == 15){
            resultado = (500 * diaria) + (10 * diaria);
            
        } else if(diaria > 15){
            resultado = (500 * diaria) + (5 * diaria);
            
        }
        
        System.out.println("O valor total a pagar: " + resultado);
    }
}
