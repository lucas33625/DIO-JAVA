import java.util.Scanner;

public class VerificadorFaixaEtaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua Idade");
        int idade = scanner.nextInt();

        if (idade <= 12) {
            System.out.println("Você é uma criança");
        } 
        
        else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente");
        }

        else
            System.out.println("Você é um adulto");        

        scanner.close();
    }
}