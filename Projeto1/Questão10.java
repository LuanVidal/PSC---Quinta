package com.mycompany.psc.quinta.Projeto1;
import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Questão10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double raio, comprimento, area, volume;
        
        System.out.print("Digite o raio: ");
        raio = input.nextDouble();
        
        comprimento = 2 * 3.14 * raio;
        area = 4 * 3.14 * Math.pow(raio, 2);
        volume = (4 * 3.14 * Math.pow(raio, 3)) / 3;
        
        System.out.print("Comprimeto: " + comprimento);
        System.out.print("\narea: " + area);
        System.out.print("\nvolume: " + volume);
    }
}
