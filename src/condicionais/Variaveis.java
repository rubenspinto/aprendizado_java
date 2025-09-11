package condicionais;

import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {

        try {
            var scan = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            var nome = scan.nextLine();

            System.out.println("Digite sua idade: ");
            var idade = scan.nextInt();

            boolean emancipado = false;
            if (idade < 18) {
                System.out.println("É emancipado (s/n)");
                emancipado = scan.next().equalsIgnoreCase("s");
            }


            var podeDidrigir = (idade >= 18) || (idade >= 16 && emancipado);

            var mensagem = podeDidrigir ?
                    "Parabéns " + nome + ", você pode dirigir \n" :
                    "Infelizmente " + nome + ", você ainda não pode dirigir \n";

            System.out.println(mensagem);
            System.out.println("Fim do programa.");

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
