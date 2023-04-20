package Projeto2;

import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double lado1, lado2, lado3;
        
        System.out.println("Informe o 1º Lado: ");
        lado1 = input.nextDouble();
        
        System.out.println("Informe o 2º Lado:");
        lado2 = input.nextDouble();
        
        System.out.println("Informe o 3º Lado:");
        lado3 = input.nextDouble();
        
        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Equilátero");
            
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("Isósceles");
            
        } else {
            System.out.println("Escaleno");
        }}   
}
