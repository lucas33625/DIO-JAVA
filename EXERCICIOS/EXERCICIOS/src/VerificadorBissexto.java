import java.util.Scanner;

public class VerificadorBissexto {
    public static void main(String[] args) {
        //Abre o terminal para inserção do ano
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano: ");

        int ano = scanner.nextInt();

        //verifica se o ano é bissexto e retorna com a resposta
        if (ano % 4 == 0) {
            System.out.println("O ano digitado " + ano + " é bissexto.");            
        } else {
            System.out.println("O ano digitado não é bissexto");
        }

        scanner.close();
    }
}
