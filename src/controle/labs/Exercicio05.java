package controle.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // instanciar a classe Scanner
        var entrada = new Scanner(System.in);

        // solicitar ao usário que informe sou nome
        System.out.println("Entre com seu nome: ");
        var nome = entrada.next();

        // solicitar para o usário informa sua idade
        System.out.println("Entre com ano corente: ");
        var anoCorrente = entrada.nextInt();

        // solicite para o usuario informar seu ano de nascimento
        System.out.println("Entre com seu ano de nascimento: ");
        var anoNascimento = entrada.nextInt();


        // calcular a idade do usuário
        var idade = (anoCorrente - anoNascimento);

        // mostrar uma mensagem para o usário com o nome e a idade
        System.out.println("Olá " + nome + ",\nVocê tem " + idade + " anos.");

    }
}
