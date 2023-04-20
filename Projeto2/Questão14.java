package Projeto2;

import java.util.Scanner;
/**
 *
 * @author Luan
 */
public class Questão14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String gitCommand;
        
        System.out.print("Digite o comando Git (clone, fetch ou pull): ");
        gitCommand = input.nextLine();

        
        switch (gitCommand) {
            case "clone" -> {
                System.out.println("\nO comando 'git clone' é usado para criar uma cópia de um repositório Git existente em um novo diretório.");
                System.out.println("Exemplo: git clone https://github.com/meu-usuario/meu-repositorio.git");
            }
            case "fetch" -> {
                System.out.println("\nO comando 'git fetch' é usado para buscar as atualizações mais recentes de um repositório Git, mas não faz a mesclagem com o seu branch local.");
                System.out.println("Exemplo: git fetch origin");
            }
            case "pull" -> {
                System.out.println("\nO comando 'git pull' é usado para buscar as atualizações mais recentes de um repositório Git e mesclar com o seu branch local.");
                System.out.println("Exemplo: git pull origin master");
            }
            default -> System.out.println("\nComando Git inválido.");
        }
    }
}
