import java.util.Scanner;

public class NumerosNoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int inicio;
        int fim;

        // Determina qual é o menor e qual é o maior para definir o intervalo
        if (num1 < num2) {
            inicio = num1;
            fim = num2;
        } else {
            inicio = num2;
            fim = num1;
        }
        
        System.out.println("\nNúmeros inteiros no intervalo entre " + inicio + " e " + fim + " (excluindo os próprios números):");

        // Começa do número seguinte ao 'inicio' e vai até o número anterior ao 'fim'
        for (int i = inicio + 1; i < fim; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        scanner.close();
    }
}