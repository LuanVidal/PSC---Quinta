package Projeto2;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Questão5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double x, resultado = 0;
        
        System.out.println("Iforme x: ");
        x = input.nextDouble();
        
        if (x < -2){
            resultado = (2*x) + 2;
            
        } else if(x < 3 && x >= -2){
            resultado = 3;
            
        } else if(x >= 3){
            resultado = x * (-1);
        }
        
        System.out.println("Resultado: " + resultado);
    }
}
