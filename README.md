# PSC---Quinta
Repositório para armazenar os programas em JAVA da UC PSC 
Equação Quadrática Resolvida


Luan Gabriel
Análise o código aseguir: public class Questão7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double a, b, c, delta, x, x1, x2;
        
        System.out.println("Informe o valor de a: ");
        a = input.nextDouble();
        
        System.out.println("Informe o valor de b: ");
        b = input.nextDouble();
        
        System.out.println("Informe o valor de c: ");
        c = input.nextDouble();
        
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
            
        } else if(a == 0 && b == 0 && c != 0){
            System.out.println("Coeficientes informados incorretamente");
            
        } else if(a == 0 && b != 0){
            System.out.println("Esta é uma equação de primeiro grau, X = " + (-c/b));
            
        } else {
            
            System.out.println("Esta é uma equação de segundo grau");
            
            delta = Math.pow(b, 2) - 4 * (a*c);
            
            if(delta < 0){
                System.out.println("Esta equação não possui raízes reais");
                
            }else if(delta == 0){
                System.out.println("Esta equação possui duas raízes reais iguais");
                
                x = -b / (2*a);
                
                System.out.println("o valor das raízes da equação: X = " + x);
                
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes");
                
                x1 = -b + Math.sqrt(delta) / 2 * a;
                x2 = -b - Math.sqrt(delta) / 2 * a;
                
                System.out.println("X1 = " + x1 + ", X2 = " + x2);
            
            }
        }
    }
}

O código é um programa em Java que resolve uma equação quadrática, ou seja, uma equação de segundo grau da forma ax^2 + bx + c = 0, onde "a", "b" e "c" são coeficientes informados pelo usuário. Vamos analisar o código em detalhes:

O código começa importando a classe "Scanner" do pacote "java.util" para permitir a leitura de entrada do usuário.

Em seguida, são declaradas as variáveis do tipo "double" para armazenar os valores dos coeficientes "a", "b", "c", além das variáveis "delta", "x1" e "x2" que serão usadas para calcular as raízes da equação.

O programa solicita ao usuário que informe os valores de "a", "b" e "c" utilizando a instância "input" da classe "Scanner" e o método "nextDouble()" para ler valores decimais.

O código utiliza uma série de estruturas condicionais "if" e "else if" para verificar os valores dos coeficientes "a", "b" e "c" e determinar qual tipo de equação está sendo resolvida.

A primeira condição verifica se "a", "b" e "c" são iguais a zero. Se forem, o programa exibe a mensagem "Igualdade confirmada: 0 = 0". Essa condição trata de casos onde todos os coeficientes são zero, o que resulta em uma equação trivial sem variáveis.

A segunda condição verifica se "a" e "b" são iguais a zero, mas "c" é diferente de zero. Se for o caso, o programa exibe a mensagem "Coeficientes informados incorretamente". Essa condição trata de casos onde "a" e "b" são zero, mas "c" é diferente de zero, o que resulta em uma equação sem variáveis x.

A terceira condição verifica se "a" é igual a zero, mas "b" é diferente de zero. Se for o caso, o programa calcula e exibe a solução para uma equação de primeiro grau utilizando a fórmula x = -c/b.

Se nenhuma das condições anteriores for verdadeira, o programa assume que os coeficientes correspondem a uma equação de segundo grau e realiza o cálculo do valor de delta utilizando a fórmula delta = b^2 - 4ac.

Em seguida, o programa utiliza mais estruturas condicionais para verificar o valor de delta e calcular as raízes da equação de acordo com o valor de delta.

Se delta for menor que zero, o programa exibe a mensagem "Esta equação não possui raízes reais", indicando que a equação não possui soluções reais.

Se delta for igual a zero, o programa exibe a mensagem "Esta equação possui duas raízes reais iguais" e calcula o valor das raízes utilizando a fórmula x = -b/(2a), armazenando o resultado na variável "x".

Se delta for maior que zero, o programa exibe a mensagem "Esta equação possui duas raízes reais diferentes" e calcula o valor das raízes utilizando a fórmula x1 = (-b + sqrt(delta)) / (2a) e x2 = (-





Luan Gabriel
Agora faça alteração para esse enunciado:
Criar uma classe equação segundo grau, a classe deve possuir: um método pra ler coeficiente um método pra caucular os valores de x, delta, x1, x2 e métodos adesões de get e set para os coeficientes 

Aqui está o código atualizado de acordo com o enunciado:

java
Copy code
import java.util.Scanner;

public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;

    // Método para ler os coeficientes
    public void lerCoeficientes() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor de a: ");
        this.a = input.nextDouble();
        System.out.println("Informe o valor de b: ");
        this.b = input.nextDouble();
        System.out.println("Informe o valor de c: ");
        this.c = input.nextDouble();
    }

    // Método para calcular os valores de x, delta, x1 e x2
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

    // Métodos de get e set para os coeficientes
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
