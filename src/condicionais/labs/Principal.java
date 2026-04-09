package condicionais.labs;

/**
 * Faça um programa que leia o nome e a idade de uma pessoa e imprima uma mensagem dizendo se ela é maior ou menor de idade.
 */

public class Principal {

    public static void main(String[] args) {

        // Criando um objeto Scanner para ler a entrada do usuário
        var entrada = new java.util.Scanner(System.in);

        // Solicitando ao usuário que digite seu nome e idade
        System.out.println("Digite seu nome: ");
        var nome = entrada.nextLine();

        // Solicitando ao usuário que digite sua idade
        System.out.println("Digite sua idade: ");
        var idade = entrada.nextInt();

        entrada.close();

        // Verificando se a pessoa é maior ou menor de idade
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade.");
        }
    }
    
}
