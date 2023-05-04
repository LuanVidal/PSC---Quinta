package pscWesley.projeto6;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i) + "º número: ");
            numeros[i] = input.nextDouble();
            
        }

        System.out.print("Posições do vetor que armazenam números negativos: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
