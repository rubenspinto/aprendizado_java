package controle.labs;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        try (var scan = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();

            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

}
