
import java.util.Scanner;

public class DiaSemanaSwitch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para os dias da semana: ");
        int dias = scanner.nextInt();

        switch (dias) {
            case 1:
            System.out.println("Domingo");
            break; // Adicionado break
        case 2:
            System.out.println("Segunda-Feira");
            break; // Adicionado break
        case 3:
            System.out.println("Terça-Feira");
            break; // Adicionado break
        case 4:
            System.out.println("Quarta-Feira");
            break; // Adicionado break
        case 5:
            System.out.println("Quinta-Feira");
            break; // Adicionado break
        case 6:
            System.out.println("Sexta-Feira");
            break; // Adicionado break
        case 7:
            System.out.println("Sábado");
            break; // Adicionado break
        default:
            System.out.println("Número inválido! Por favor, digite um número de 1 a 7.");
            break; // Adicionado break
    }

    scanner.close(); // Fecha o scanner
}
}