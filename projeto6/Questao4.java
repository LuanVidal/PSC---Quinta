package pscWesley.projeto6;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numeros = new double[10]; 

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextDouble();
        }

        System.out.print("\nElementos armazenados nas posições pares: ");
        for (int i = 0; i < numeros.length; i += 2) {
            System.out.print(numeros[i] + " ");
        }

        input.close();
    }
}
