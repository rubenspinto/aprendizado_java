package controle.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // solicitar primeiro número
        System.out.print("Digite o primeiro numero: ");
        int primeiro = input.nextInt();

        // solicitar segundo número, maior que o primeiro
        int segundo;
        do {
            System.out.println("Informe o segundo número (maior que " +  primeiro + "): ");
            segundo = input.nextInt();

            if (segundo <= primeiro) {
                System.out.println("Erro: O segundo número é menor que o primeiro!");
            }
        } while (segundo <= primeiro);
    }
}
