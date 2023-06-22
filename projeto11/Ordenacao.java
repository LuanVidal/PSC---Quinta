package pscWesley.projeto11;

import java.util.Scanner;

public class Ordenacao {
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }

    public static int partition(int[] vetor, int low, int high) {
        int pivot = vetor[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (vetor[j] < pivot) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[high];
        vetor[high] = temp;
        return i + 1;
    }

    public static void quickSort(int[] vetor, int low, int high) {
        if (low < high) {
            int pi = partition(vetor, low, high);
            quickSort(vetor, low, pi - 1);
            quickSort(vetor, pi + 1, high);
        }
    }

    public static void merge(int[] vetor, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; ++i)
            leftArray[i] = vetor[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = vetor[middle + 1 + j];
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                vetor[k] = leftArray[i];
                i++;
            } else {
                vetor[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            vetor[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            vetor[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] vetor, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(vetor, left, middle);
            mergeSort(vetor, middle + 1, right);
            merge(vetor, left, middle, right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int opcao;

        do {
            System.out.println("Escolha um método de ordenação:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Quicksort");
            System.out.println("5. Merge Sort");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            if (opcao == 6) {
                break;
            }

            System.out.println("Informe um vetor de 10 números:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }

            switch (opcao) {
                case 1:
                    bubbleSort(vetor);
                    break;
                case 2:
                    selectionSort(vetor);
                    break;
                case 3:
                    insertionSort(vetor);
                    break;
                case 4:
                    quickSort(vetor, 0, vetor.length - 1);
                    break;
                case 5:
                    mergeSort(vetor, 0, vetor.length - 1);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("Vetor ordenado:");
            for (int i = 0; i < 10; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        } while (true);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
