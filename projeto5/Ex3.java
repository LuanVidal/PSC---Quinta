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
public class Ex3 {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int fact=1, num;
        
        System.out.println("Informe o numero: ");
        num = input.nextInt();
        
        if (num == 0) {
            System.out.println("O fatorial de 0 eh: 1");
        }
        else {
            for(int i = 1; i <= num; i++) {
                fact = fact*i;
            }
            System.out.println("O fatorial de" + num + "eh: " + fact);
        }  
    }
    
}
