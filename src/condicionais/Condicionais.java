package condicionais;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        try {
            var scan = new Scanner(System.in);
            System.out.println("Digite um numero de 1 a 7 ");
            var opcao = scan.nextInt();

            // escrever um swith case para variaficar o dia da semana.
            var mesagem = switch (opcao) {
                case 1, 7 -> {
                    var dia = opcao == 1 ? "Domingo" : "Sábado";
                    yield String.format("Hoje é %s, fim de semana uhull \\0/", dia);
                }
                case 2 -> "Segunda";
                case 3 -> "Terça";
                case 4 -> "Quarta";
                case 5 -> "Quinta";
                case 6 -> "Sexta";
                default -> "Opção invalida";
            };
            System.out.println(mesagem);
            scan.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
}
