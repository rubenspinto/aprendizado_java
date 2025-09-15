package condicionais.labs;

public class Principal {

    public static void main(String[] args) {

        var entrada = new java.util.Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        var idade = entrada.nextInt();

        

        entrada.close();
    }
    
}
