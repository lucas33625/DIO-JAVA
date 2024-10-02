
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class VerificadorNumero {

    public static void main(String[] args) {
        /*Verificar se um número é positivo, negativo ou zero  */

        //Pede ao usuário digitar um número
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();

        //Verifica o número digitado e retorna se é positivo, negativo ou 0 junto do valor digitado
        if (numero > 0) {
            System.out.println("O número digitado é positivo e foi o número " + numero);

        } else if (numero < 0) {
            System.out.println("O número digitado é negativo e foi o número " + numero);            
        } else if (numero == 0) {
            System.out.println("O número é igual a 0");
        } 
        scanner.close();
    }
}