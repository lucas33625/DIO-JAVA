
import java.util.Scanner;

public class VerificarTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int numero3 = scanner.nextInt();

        int maior = numero1;
       
        if (numero2 > maior) {
            maior = numero2;

        } if (numero3 > maior){
            maior = numero3;

            
        }
        System.out.println("O maior número digitado é: " + maior);
        scanner.close();
        }
    }

