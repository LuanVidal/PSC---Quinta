/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratica10Praticando;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Exercício {
    
    public void ordenaBolha (int vetor[]) {
        int aux;
        for(int i =0; i < vetor.length; i++){
            for(int j = 0; j < (vetor.length-1); j++) {
                if (vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }
    
    public void ordenaSelect (int vetor[]) {
        int aux;
        int pm;
        
        for(int i =0; i < vetor.length; i++){
            pm = i;
            for(int j = i+1; j < vetor.length; j++) {
                if (vetor[j] < vetor[pm]){
                    pm = j;
                }
                aux = vetor[i];
                vetor[i] = vetor[pm];
                vetor[pm] = aux;
            }
        }
    }
    
    public void ordenaInsert (int vetor[]) {
        int x;
        int j;
        int i;
        for(i =1; i < vetor.length; i++){
            x = vetor[i];
            j = i-1;
            while ((j >= 0) && (vetor[j] > x)) {
                vetor[j+1] = vetor[j];
                j = j-1;
            }
            vetor[j+1] = x;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Exercício ex = new Exercício();
        
        int[] vetor = new int[5];
        int tipo;
        int i;
        
        System.out.println("De que forma deseja organizar? (Digite 1 para Bolha, 2 para Seletor e 3 para Insercao)");
        tipo = input.nextInt();
        
        while (tipo != 0){
           System.out.println("Informe numeros: ");
            for(i=0; i < vetor.length; i++) {
            System.out.println("n" + i + ": ");
            vetor[i] = input.nextInt();
            }
        
            switch (tipo) {
                case 1 -> ex.ordenaBolha(vetor);
                case 2 -> ex.ordenaSelect(vetor);
                case 3 -> ex.ordenaInsert(vetor);
            }
        
            System.out.println("Vetor informado: ");
            for(i=0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            }
            System.out.println();
            System.out.println("De que forma deseja organizar? (Digite 1 para Bolha, 2 para Seletor, 3 para Insercao e 0 para encerrar)");
        tipo = input.nextInt();
        } 
        System.out.println("Fim do programa");
    }
        
        
    
}
