package controle;

import java.util.Scanner;

public class Repeticao_while {

    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        var nome = "";

        do {
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            System.out.println(nome);
        } while (!nome.equalsIgnoreCase("sair"));

        System.out.println("Fim do programa.");
    }
}
