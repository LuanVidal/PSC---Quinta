package pscWesley.projeto9;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        while (true) {
            System.out.print("Digite o número a ser pesquisado (ou -1 para sair): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            System.out.print("Digite 1 para busca sequencial ou 2 para busca sequencial com sentinela: ");
            int opcao = sc.nextInt();

            int comparacoes = 0;
            boolean encontrado = false;
            if (opcao == 1) {
                for (int i = 0; i < vetor.length; i++) {
                    comparacoes++;
                    if (vetor[i] == num) {
                        encontrado = true;
                        break;
                    }
                }
            } else if (opcao == 2) {
                int ultimo = vetor[vetor.length - 1];
                vetor[vetor.length - 1] = num;
                int i = 0;
                while (vetor[i] != num) {
                    comparacoes++;
                    i++;
                }
                vetor[vetor.length - 1] = ultimo;
                if (i < vetor.length - 1 || vetor[vetor.length - 1] == num) {
                    encontrado = true;
                }
            } else {
                System.out.println("Opção inválida.");
                continue;
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
