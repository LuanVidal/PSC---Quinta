package pscWesley.projeto6;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numeros = new double[10]; 

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextDouble();
        }

        double menor = numeros[0];
        double maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];

            }
            if (numeros[i] > maior) {
                maior = numeros[i];

            }
        }

        System.out.println("\nMenor número informado: " + menor);
        System.out.println("Maior número informado: " + maior);

        input.close();
    }
}
