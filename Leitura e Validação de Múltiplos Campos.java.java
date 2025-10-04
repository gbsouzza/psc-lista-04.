import java.util.Scanner;

public class ValidacaoCampos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade = -1;
        double salario = -1;
        String sexo = "";
        String estadoCivil = "";

        // Validação do Nome
        do {
            System.out.print("Nome (min. 4 caracteres): ");
            nome = scanner.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Nome inválido! Deve ter mais de 3 caracteres.");
            }
        } while (nome.length() <= 3);

        // Validação da Idade
        do {
            System.out.print("Idade (entre 0 e 150): ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade < 0 || idade > 150) {
                    System.out.println("Idade inválida! Deve ser entre 0 e 150.");
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro para a idade.");
                scanner.next();
            }
        } while (idade < 0 || idade > 150);
        scanner.nextLine();

        // Validação do Salário
        do {
            System.out.print("Salário (maior que zero): ");
            if (scanner.hasNextDouble()) {
                salario = scanner.nextDouble();
                if (salario <= 0) {
                    System.out.println("Salário inválido! Deve ser maior que zero.");
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número para o salário.");
                scanner.next();
            }
        } while (salario <= 0);
        scanner.nextLine();

        // Validação do Sexo
        do {
            System.out.print("Sexo ('f' para feminino ou 'm' para masculino): ");
            sexo = scanner.nextLine().toLowerCase();
            if (!sexo.equals("f") && !sexo.equals("m")) {
                System.out.println("Sexo inválido! Digite 'f' ou 'm'.");
            }
        } while (!sexo.equals("f") && !sexo.equals("m"));

        // Validação do Estado Civil
        do {
            System.out.print("Estado Civil ('s', 'c', 'v', 'd' - solteiro, casado, viúvo, divorciado): ");
            estadoCivil = scanner.nextLine().toLowerCase();
            
            if (!estadoCivil.equals("s") && !estadoCivil.equals("c") && 
                !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
                System.out.println("Estado Civil inválido! Digite 's', 'c', 'v' ou 'd'.");
            }
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && 
                 !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        // Exibição Final
        System.out.println("\n--- Dados Válidos Registrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("Sexo: " + sexo.toUpperCase());
        System.out.println("Estado Civil: " + estadoCivil.toUpperCase());

        scanner.close();
    }
}