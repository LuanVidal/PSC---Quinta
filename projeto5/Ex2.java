/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática5;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex2 {
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int num1, num2, i;

        System.out.println("Informe o 1o numero: ");
        num1 = input.nextInt();

        System.out.println("Informe o 2o numero: ");
        num2 = input.nextInt();

        System.out.println("Os numeros inteiros entre eles são: ");
        if (num1 < num2) {
            for(i = num1+1; i < num2; i++)    
            System.out.printf(i + " , ");
        }
        else if (num2 < num1) {
            for(i = num1-1; i > num2; i--)    
            System.out.printf(i + " , ");
        }

    }
}
