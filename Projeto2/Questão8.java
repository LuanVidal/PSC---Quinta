package Projeto2;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Questão8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do produto: ");
        int codigo = scanner.nextInt();

        double preco = 0.0;

        switch (codigo) {
            case 1:
                preco = 99.99;
                break;
            case 2:
                preco = 103.89;
                break;
            case 3:
                preco = 49.98;
                break;
            case 4:
                preco = 89.72;
                break;
            case 5:
                preco = 97.35;
                break;
            default:
                System.out.println("Código inválido!");
                System.exit(0);
        }

        System.out.printf("Preço: R$ %.2f\n", preco);
    }
}
