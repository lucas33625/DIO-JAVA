import java.util.Scanner;

public class VerificadorParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um númmero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        
        } else {
            System.out.println("O número é impar");
        }
        scanner.close();

    }
}
