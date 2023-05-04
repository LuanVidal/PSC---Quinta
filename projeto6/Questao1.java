package pscWesley.projeto6;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        int somaPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);

        input.close();
    }
}
