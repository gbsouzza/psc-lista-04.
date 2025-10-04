import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        final int QUANTIDADE = 5;

        for (int i = 1; i <= QUANTIDADE; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / QUANTIDADE;

        System.out.println("\nA soma dos números é: " + soma);
        System.out.printf("A média dos números é: %.2f%n", media);
        scanner.close();
    }
}