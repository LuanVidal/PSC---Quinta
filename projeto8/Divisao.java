package pscWesley.projeto8;

public class Divisao {
    public static void dividir(int dividendo, int divisor)throws ArithmeticException{
        if(divisor==0){
            throw new
ArithmeticException("Não é possível dividir por zero.");
    {
    
    if (dividendo < 0){
        throw new ArithmeticException("O dividendo deve ser maior ou igual a zero.");
    }

    int resultado = dividendo / divisor;
    System.out.println("Resultado:"+ resultado);
    }
}