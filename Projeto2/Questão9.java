package Projeto2;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Questão9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int planeta;
        double v0, h, t, v;
        double g = 0.0;
        
        System.out.println("\n[1] - Mercurio (3.7 m/s^2)\n[2] - Vênus (8.8 m/s^2)"
                + "\n[3] - Terra (9.8 m/s^2)\n[4] - Marte (3.8 m/s^2)"
                + "\n[5] - Júpter (26.4 m/s^2)\n[6] - Saturno (11.5 m/s^2)"
                + "\n[7] - Urano (9.3 m/s^2)\n[8] - Netuno (12.2 m/s^2)"
                + "\n[9] - Plutão (0.9 m/s^2)");
        
        System.out.print("\nEscolha um planeta para o cauculo: ");
        planeta = input.nextInt();
        
        switch (planeta) {
            case 1:
                g = 3.7;
                break;
            case 2:
                g = 8.8;
                break;
            case 3:
                g = 9.8;
                break;
            case 4:
                g = 3.8;
                break;
            case 5:
                g = 26.4;
                break;
            case 6:
                g = 11.5;
                break;
            case 7:
                g = 9.3;
                break;
            case 8:
                g = 12.2;
                break;
            case 9:
                g = 0.9;
                break;
                
            default:
                System.out.println("opção invalia");
        }
        
        System.out.print("\nInforme v0: ");
        v0 = input .nextDouble();
        
        System.out.print("Informe t: ");
        t = input .nextDouble();
        
        v =  v0 - (g*t);
        h = (v0*t) - (g*Math.pow(t, 2)/2);
        
        System.out.println("\nv(t) = " + v);
        System.out.println("h(t) = " +h);
        
    }
}
