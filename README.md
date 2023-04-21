import java.util.Scanner;

public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;

    public void lerCoeficientes() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor de a: ");
        this.a = input.nextDouble();
        
        System.out.println("Informe o valor de b: ");
        this.b = input.nextDouble();
        
        System.out.println("Informe o valor de c: ");
        this.c = input.nextDouble();
    }

    public void calcularValores() {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
            
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
            
        } else if (a == 0 && b != 0) {
            System.out.println("Esta é uma equação de primeiro grau, X = " + (-c / b));
            
        } else {
            System.out.println("Esta é uma equação de segundo grau");
            delta = Math.pow(b, 2) - 4 * (a * c);
            
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais");
                
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais");
                x1 = -b / (2 * a);
                
                System.out.println("o valor das raízes da equação: X = " + x1);
                
            } else {
            
                System.out.println("Esta equação possui duas raízes reais diferentes");
                
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                
                System.out.println("X1 = " + x1 + ", X2 = " + x2);
            }
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public static void main(String[] args) {
    
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
        
        equacao.lerCoeficientes();
        equacao.calcularValores();
        
    }
}
