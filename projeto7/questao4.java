package pscWesley.projeto7;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        
        int i,j;
        int[][] matriz = new int[5][5];
        Scanner input = new Scanner(System.in);
        
        for (i = 0; i < matriz.length; i++)

         for (j = 0; j < matriz[i].length; j++) {

             System.out.println("Informe um número: ");
             matriz[i][j] = input.nextInt();
          }
        
        System.out.println("Matriz informada:");
        for (i = 0; i < matriz.length; i++) {
             for (j = matriz[i].length-1; j > -1 ; j--) {
                 if (i == j || (i+j) == (matriz[i].length -1)) {
                     System.out.printf("%2d ", matriz[i][j]);
                 }
                 else {
                     System.out.printf("%2d ", matriz[i][j]);
                 }
             }
             System.out.println();
         }

         input.close();
     }
}
