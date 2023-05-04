package pscWesley.projeto7;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        
        int i, j;
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (i = 0; i < matriz.length; i++) {

         for (j = 0; j < matriz[i].length; j++) {

             System.out.println("Informe um número: ");
             matriz[i][j] = input.nextInt();

            }
        }

        System.out.println("Matriz informada:");
        for (i = 0; i < matriz.length; i++) {
             for (j = 0; j < matriz[i].length; j++) {
                 
                 if (i % 2 == 0 && j % 2 != 0) {
                   System.out.printf("%2d ", matriz[i][j]);  
                }
            }
         System.out.println();
        }

        input.close();
    }
}
