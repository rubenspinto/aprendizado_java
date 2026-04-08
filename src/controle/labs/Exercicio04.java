package controle.labs;

import java.time.Year;
import java.util.Scanner;

/**
 * Programa que solicita ao usuário seu nome e ano de nascimento, calcula a idade do usuário com base no ano corrente e exibe uma mensagem de saudação com o nome e a idade do usuário.
 * O programa utiliza a classe Scanner para ler a entrada do usuário e a classe Year para obter o ano corrente.
 */
public class Exercicio04 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário a partir do console.
        Scanner entrada = new Scanner(System.in);

        // Exibe uma mensagem solicitando ao usuário que informe seu nome e lê a entrada do usuário usando o método nextLine() do Scanner.
        System.out.println("Informe seu nome: ");
        var nome = entrada.nextLine();

        // Obtém o ano corrente usando a classe Year do pacote java.time e exibe-o para o usuário.
        int anoCorrente = Year.now().getValue();
        System.out.println("Ano corrente: " + anoCorrente);

        // Exibe uma mensagem solicitando ao usuário que informe seu ano de nascimento.
        System.out.println("Entre com seu ano de nascimento: " );
        var anoNascimento = entrada.nextInt();

        // Calcula a idade do usuário subtraindo o ano de nascimento do ano corrente.
        var idade = (anoCorrente - anoNascimento);

        // Exibe uma mensagem de saudação com o nome do usuário e a idade calculada.
        System.out.println("Olá " + nome + ",\nVocê tem " + idade + " anos.");

        // Fechar o scanner é uma boa prática para liberar os recursos associados a ele.
        entrada.close();
    }
}
