package controle.labs;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.println("Digite um nomero para calcular a tabuada: ");
        var numero = scan.nextInt();

        // Exibir a tabuada
        System.out.println("\n══════════════════════════");
        System.out.println("      TABUADA DO " + numero);
        System.out.println("══════════════════════════");

        for(var i = 1; i <= 10; i++){
            var resultado = numero * i;
            System.out.printf("%d X %2d = %2d\n",numero, i, resultado);
        }

        scan.close();
    }
}
