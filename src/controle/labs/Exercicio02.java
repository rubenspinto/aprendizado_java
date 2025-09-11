package controle.labs;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        try {
            var entrada = new Scanner(System.in);
            System.out.println("Digite seu peso: ");
            double peso = entrada.nextDouble();

            System.out.println("Digite sua altura: ");
            double altura = entrada.nextDouble();

            var mensagem = "";

            var calculoIMC = peso/(altura*altura);

            if (calculoIMC <= 18.5) {
                mensagem = String.format("%.2f - %s", calculoIMC, "você está abaixo do peso.");
            } else if (calculoIMC > 18.5 && calculoIMC <= 24.9) {
                mensagem = String.format("%.2f - %s", calculoIMC, "você com o peso ideal.");
            } else if (calculoIMC > 25 && calculoIMC <= 29.9) {
                mensagem = String.format("%.2f - %s", calculoIMC, "você está levemente acima do peso.");
            } else if (calculoIMC > 30 && calculoIMC <= 34.9) {
                mensagem = String.format("%.2f - %s", calculoIMC, "Obsideade grau I.");
            } else if(calculoIMC > 35 && calculoIMC <= 39.9){
                mensagem = String.format("%.2f - %s", calculoIMC, "Obesidade grau II (Severa).");
            } else if(calculoIMC >= 40){
                mensagem = String.format("%.2f - %s", calculoIMC, "Obesidade III (Móbida).");
            } else {
                mensagem = String.format("%.2f - %s", calculoIMC, "Valor infortmado inválido");
            }

            System.out.println(mensagem);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
