package pscWesley.projeto9;

import java.util.Arrays;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor);

        while (true) {
            System.out.print("Digite o número a ser pesquisado (ou -1 para sair): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            int comparacoes = 0;
            int inicio = 0;
            int fim = vetor.length - 1;
            boolean encontrado = false;
            while (inicio <= fim) {
                comparacoes++;
                int meio = (inicio + fim) / 2;
                if (vetor[meio] == num) {
                    encontrado = true;
                    break;
                } else if (vetor[meio] < num) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }

            if (encontrado) {
                System.out.println("O número " + num + " foi encontrado após " + comparacoes + " comparações.");
            } else {
                System.out.println("O número " + num + " não foi encontrado após " + comparacoes + " comparações.");
            }
        }

        sc.close();
    }
}
