package controle;

import java.util.Arrays;
import java.util.List;

public class Repeticao_for {
    public static void main(String[] args) {
        for(var i = 1; i <= 7; i++) {
            if (i % 2 == 0) continue;
            System.out.println("Valor = " + i);
        }

        List<String> frutas = Arrays.asList("Macã", "Uva", "Pera", "Mamão", "Melancia", "Pitaia");

        for (var fruta : frutas) {
            System.out.println("Fruta = " + fruta);
        }
    }
}
