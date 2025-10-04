import java.util.Scanner;

public class CrescimentoPopulacionalPersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir;

        do {
            double popA = 0;
            double taxaA = 0;
            double popB = 0;
            double taxaB = 0;
            boolean entradaValida;

            // Validação População A
            do {
                System.out.print("Informe a população inicial do País A: ");
                if (scanner.hasNextDouble()) {
                    popA = scanner.nextDouble();
                    entradaValida = popA > 0;
                    if (!entradaValida) System.out.println("A população deve ser maior que zero.");
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();
                    entradaValida = false;
                }
            } while (!entradaValida);

            // Validação Taxa A
            do {
                System.out.print("Informe a taxa de crescimento (%) do País A: ");
                if (scanner.hasNextDouble()) {
                    taxaA = scanner.nextDouble() / 100.0;
                    entradaValida = taxaA >= 0;
                    if (!entradaValida) System.out.println("A taxa deve ser maior ou igual a zero.");
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();
                    entradaValida = false;
                }
            } while (!entradaValida);

            // Validação População B
            do {
                System.out.print("Informe a população inicial do País B: ");
                if (scanner.hasNextDouble()) {
                    popB = scanner.nextDouble();
                    entradaValida = popB > 0;
                    if (!entradaValida) System.out.println("A população deve ser maior que zero.");
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();
                    entradaValida = false;
                }
            } while (!entradaValida);

            // Validação Taxa B
            do {
                System.out.print("Informe a taxa de crescimento (%) do País B: ");
                if (scanner.hasNextDouble()) {
                    taxaB = scanner.nextDouble() / 100.0;
                    entradaValida = taxaB >= 0;
                    if (!entradaValida) System.out.println("A taxa deve ser maior ou igual a zero.");
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();
                    entradaValida = false;
                }
            } while (!entradaValida);

            scanner.nextLine(); // Consome a quebra de linha

            int anos = 0;
            if (popA >= popB) {
                System.out.println("\nA população do País A já é maior ou igual à do País B. Nenhum cálculo necessário.");
            } else if (taxaA <= taxaB) {
                System.out.println("\nERRO: A população A nunca alcançará a população B pois a taxa de crescimento de A é menor ou igual à de B.");
            } else {
                while (popA < popB) {
                    popA *= (1 + taxaA);
                    popB *= (1 + taxaB);
                    anos++;
                }
                System.out.println("----------------------------------------");
                System.out.printf("População Final A: %.0f%n", popA);
                System.out.printf("População Final B: %.0f%n", popB);
                System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou se iguale à população do país B.");
            }

            System.out.print("\nDeseja repetir a operação? (S/N): ");
            repetir = scanner.nextLine().toLowerCase();
        } while (repetir.equals("s"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}