package Projeto2;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Questão10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double n1, n2;
        double  result = 0;
        int opc;
        
        System.out.print("Digite o 1º Número: ");
        n1 = input.nextDouble();
        System.out.print("Digite o 2º Número: ");
        n2 = input.nextDouble();
        
        System.out.println("\n1 - Somar os dois números\n"
                + "2 - Multiplicar os dois números\n"
                + "3 - Subtrair o número maior pelo número menor (se os dois forem iguais, retorne zero)\n"
                + "4 - Dividir o primeiro número pelo segundo (lembre-se de que não existe divisão por" +
                " zero).");
        
        System.out.print("\nQual opção: ");
        opc = input.nextInt();
        
        switch (opc) {
            case 1:
                result = n1 + n2;
                break;
                
            case 2:
                result = n1 * n2;
                break;
                
            case 3:
                if (n1 > n2) {
                    result = n1 - n2;
                    
                } else if(n2 > n1){
                    result = n2 - n1;
                  
                } else {
                    result = 0;
                }
                
                break;
                
            case 4:
                if (n2 != 0){
                    result = n1 / n2;
                    
                } else {
                    System.out.println("\nnão existe divisão por zero");
                    
                }
                
                break;    
                
            default:
                System.out.println("Opção invalida");
        }
        
        System.out.println("\nO resultado é: " + result);
    }
}
