package Projeto2;

import java.util.Scanner;
/**
 *
 * @author Luan
 */
public class Questão6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double x, y, z;
        boolean condicao1, condicao2, condicao3;
        
        System.out.print("Informe o primeiro lado: ");
        x = scanner.nextDouble();

        System.out.print("Informe o segundo lado: ");
        y = scanner.nextDouble();

        System.out.print("Informe o terceiro lado: ");
        z = scanner.nextDouble();

        condicao1 = Math.abs(y - z) < x && x < y + z;
        condicao2 = Math.abs(x - z) < y && y < x + z;
        condicao3 = Math.abs(x - y) < z && z < x + y;

        if (condicao1 && condicao2 && condicao3) {
            System.out.println("Os três valores informados podem ser os comprimentos dos lados de um triângulo");
            
        } else {
            System.out.println("Os três valores informados não podem ser os comprimentos dos lados de um triângulo");
            
        }

    }
}
