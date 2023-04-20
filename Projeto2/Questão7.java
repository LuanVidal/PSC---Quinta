package Projeto2;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Questão7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double a, b, c, delta, x, x1, x2;
        
        System.out.println("Informe o valor de a: ");
        a = input.nextDouble();
        
        System.out.println("Informe o valor de b: ");
        b = input.nextDouble();
        
        System.out.println("Informe o valor de c: ");
        c = input.nextDouble();
        
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
            
        } else if(a == 0 && b == 0 && c != 0){
            System.out.println("Coeficientes informados incorretamente");
            
        } else if(a == 0 && b != 0){
            System.out.println("Esta é uma equação de primeiro grau, X = " + (-c/b));
            
        } else {
            
            System.out.println("Esta é uma equação de segundo grau");
            
            delta = Math.pow(b, 2) - 4 * (a*c);
            
            if(delta < 0){
                System.out.println("Esta equação não possui raízes reais");
                
            }else if(delta == 0){
                System.out.println("Esta equação possui duas raízes reais iguais");
                
                x = -b / (2*a);
                
                System.out.println("o valor das raízes da equação: X = " + x);
                
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes");
                
                x1 = -b + Math.sqrt(delta) / 2 * a;
                x2 = -b - Math.sqrt(delta) / 2 * a;
                
                System.out.println("X1 = " + x1 + ", X2 = " + x2);
            
            }
        }
    }
}
