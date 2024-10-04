import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        //Abre um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário o primeiro númmero
        System.out.println("Digite um número: ");
        double numeroUm = scanner.nextDouble();

        //Solicita ao usuário um segundo número
        System.out.println("Digite mais um número: ");
        double numeroDois = scanner.nextDouble();

        //Solicita ao usuário a operação matemática desejada
        System.out.println("Digite o sinal da operação matemática(/,*,-,+). ");
        char operacao = scanner.next().charAt(0);

        //Variável para armazenar o Resultado
        double resultado;

        //Estrutura switch para realizar a operacao
        switch (operacao) {
            case '+':
                resultado = numeroUm + numeroDois;
                System.out.println("Resultado " + resultado);
                break;
            case '-':
                resultado = numeroUm - numeroDois;
                System.out.println("Resultado " + resultado);
                break;
            case '*':
                resultado = numeroUm * numeroDois;
                System.out.println("Resultado " + resultado);
                break;
            case '/':
            if (numeroDois != 0) {
                resultado = numeroUm / numeroDois;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero!");
                break;
            }

            default:
            System.out.println("Operação inválida!");
                break;
        }

        //Fecha o Scanner
    scanner.close();
    }
}