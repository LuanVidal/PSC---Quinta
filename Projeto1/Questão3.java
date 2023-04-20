package com.mycompany.psc.quinta.Projeto1;

import java.util.Scanner;

public class Questão3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double cotdolar, qntdolar, convert;
        
        System.out.print("Digite a cotação do dolar: ");
        cotdolar = input.nextDouble();
        
        System.out.print("Digite quantos dolares você psssui: ");
        qntdolar = input.nextDouble();
        
        convert = qntdolar * cotdolar;
        
        System.out.println("Real: R$ " + convert);
    }
}
