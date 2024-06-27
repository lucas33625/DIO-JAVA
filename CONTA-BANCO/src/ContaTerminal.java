import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //importa a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //exibe a mensagem ao usuario
        System.out.println("Digite seu número de conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        double saldo = 240.4;
        //obter pelo scanner os valores digitados no terminal
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nossa agência " + agencia + " com o número " + numeroConta + ". Seu saldo de R$ " + saldo + " já está disponível para saque.");
        //exibir a mensagem conta criada
        scanner.close();
    }
}
