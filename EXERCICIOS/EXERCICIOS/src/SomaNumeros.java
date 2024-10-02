
import java.util.Scanner;

public class SomaNumeros {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Verifica se o número é positivo
        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            int soma = 0; // Inicializa a variável soma

            // Loop para calcular a soma de 1 até numero
            for (int i = 1; i <= numero; i++) {
                soma += i;
                // Se quiser, você pode imprimir cada número
                System.out.println(i);
            }

            // Exibe o resultado da soma
            System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
        }

        scanner.close();
    }
}