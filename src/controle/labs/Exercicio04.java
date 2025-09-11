package controle.labs;

import java.time.Year;
import java.util.Scanner;

/**
 * This program calculates the user's age based on their birth year and the current year.
 */
public class Exercicio04 {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console.
        Scanner entrada = new Scanner(System.in);

        // Prompt the user to enter their name.
        System.out.println("Informe seu nome: ");

        // Read the user's name from the input.
        var nome = entrada.nextLine();

        // Get the current year automatically.
        int anoCorrente = Year.now().getValue();
        System.out.println("Ano corrente: " + anoCorrente);

        // Prompt the user to enter their birth year.
        System.out.println("Entre com seu ano de nascimento: " );
        var anoNascimento = entrada.nextInt();

        // Calculate the user's age.
        var idade = (anoCorrente - anoNascimento);

        // Display a greeting message with the user's name and calculated age.
        System.out.println("Olá " + nome + ",\nVocê tem " + idade + " anos.");

        // Close the scanner to prevent resource leaks.
        entrada.close();
    }
}
