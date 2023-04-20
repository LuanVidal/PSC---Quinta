package Projeto2;

import java.util.Scanner;
/**
 *
 * @author Luan
 */
public class Questão4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double altura, peso, imc;
        
        System.out.println("Iforme sua altura: ");
        altura = input.nextDouble();
        
        System.out.println("Informe seu peso:");
        peso = input.nextDouble();
        
        imc = peso / Math.pow(altura, 2);
        
        
        if(imc < 20){
            System.out.println("Abaixo do Peso");
            
        } else if(imc >= 20 && imc < 25){
            System.out.println("Normal");
            
        } else if(imc >= 25 && imc < 30){
            System.err.println("Sobrepeso");
                
        } else if(imc >= 30 && imc <= 40){
            System.out.println("Obesidade");
            
        } else {
            System.out.println("Imc Invalido");
        } 
    }
}
