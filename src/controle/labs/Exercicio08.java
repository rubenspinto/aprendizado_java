package controle.labs;

import java.util.Scanner;

/**
 * Lista python Brasil - Modulo 1
 * Exercicio 8: Faça um programa que pergunte quanto
 * você ganha por hora e o número de horas
 * trabalhadas no mês. Calcule e mostre o total do
 * seu salário no referido mês.
 */

public class Exercicio08 {
    public static void main(String[] args) {

        try (var entrada = new Scanner(System.in)) {
            System.out.println("Digite quanto você ganha por hora: ");
            var valorHora = entrada.nextDouble();

            System.out.println("Digite o número de horas trabalhadas no mês: ");
            var horasTrabalhadas = entrada.nextDouble();

            // calcular o salário
            var salario = valorHora * horasTrabalhadas;

            // mostrar o salário
            System.out.println("O seu salário é: " + salario);

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

    }
}
