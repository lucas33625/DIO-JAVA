import java.util.Locale;
import java.util.Scanner;

public class SistemaCalculoEscolar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a frequência do aluno ");
        double frequencia = scanner.nextDouble();

        if (frequencia >= 75) {
            System.out.println("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
    
            System.out.print("Insira a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Insira a terceira nota: ");
            double nota3 = scanner.nextDouble();

            // Calcular a média
            double media = (nota1 + nota2 + nota3) / 3;

            if (media >= 6) {
                System.out.println("Aprovado! Média: " + media);
            } else if (media >= 4 && media < 6) {
                System.out.println("Recuperação. Média: " + media);
            } else {
                System.out.println("Reprovado. Média: " + media);
            }
        } else {
            System.out.println("Reprovado por frequência insuficiente.");
        }

        // Fechar o Scanner
        scanner.close();
    }
}

