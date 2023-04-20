package Projeto2;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Questão12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int idade;
        double sale = 0.0;
        String sexo;
        
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        input.nextLine();
        
        System.out.print("Digite seu sexo [M]asculino | [F]eminino: ");
        sexo = input.nextLine();
        
        if(sexo.equalsIgnoreCase("M")){
            if(idade <= 15){
                sale = 60;
                
            } else if(idade > 15 && idade <= 18){
                sale = 75;
                
            } else if(idade > 19 && idade <= 30){
                sale = 90;
                
            } else if(idade > 30 && idade <= 40){
                sale = 85;
                
            } else if(idade > 40){
                sale = 80;
                
            }
            
        } else if (sexo.equalsIgnoreCase("F")){
            
           if(idade <= 18){
                sale = 60;
                
            } else if(idade > 18 && idade <= 25){
                sale = 90;
                
            } else if(idade > 25 && idade <= 40){
                sale = 85;
                 
            } else if(idade > 40){
                sale = 80;
                
            }
        }
        
        System.out.println("Preço a pagar: R$ " + sale);
    }
 
}
