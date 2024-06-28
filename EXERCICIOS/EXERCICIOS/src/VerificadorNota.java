import java.util.Scanner;

public class VerificadorNota {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite uma nota: ");
        double nota = scanner.nextDouble();
        if (nota >= 0 && nota <= 10) {
            System.out.println("O número digitado é válido.");
            
        }

        else
            System.out.println("Número inválido.");

        scanner.close();
    }
}
