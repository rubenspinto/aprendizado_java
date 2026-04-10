package controle.labs;

import java.util.Scanner;

/**
 * Lista python Brasil - Modulo 1
 * Exercicio 7: Faça um programa que calcule a área de
 * um quadrado, depois mostre o dobro desta área para o
 * usuário.
 */

public class Exercicio07 {
    public static void main(String[] args) {

        try (var entrada = new Scanner(System.in)) {
            System.out.println("Digite o valor do lado do quadrado: ");
            var lado = entrada.nextDouble();

            // calcular a área de quadrade
            var area = Math.pow(lado, 2);

            // mostrar a area do quadrado
            System.out.println("A área do quadrado é: " + area);

            // mostrar o dobro da area
            System.out.println("O dobro da área do quadrado é: " + (area * 2));

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

    }
}
