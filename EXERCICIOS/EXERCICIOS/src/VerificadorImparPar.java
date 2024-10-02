
import java.util.Scanner;

public class VerificadorImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
        System.out.println("O número digitado é par.");    

        } else {
            System.out.println("O número digitado é impar.");
            
        scanner.close();
    }
}
}
