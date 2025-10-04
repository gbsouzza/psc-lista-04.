import java.util.Scanner;

public class LoginSenhaDiferentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario;
        String senha;

        System.out.print("Informe o nome de usuário: ");
        nomeUsuario = scanner.nextLine();
        
        boolean senhaInvalida;

        // O loop 'while' continuará enquanto a condição (senha ser igual ao nome de usuário) for verdadeira.
        do {
            System.out.print("Informe a senha: ");
            senha = scanner.nextLine();

            // Usa 'equalsIgnoreCase' para ser case-insensitive (não diferenciar maiúsculas/minúsculas)
            // mas 'equals' pode ser usado se a diferenciação for necessária.
            if (senha.equalsIgnoreCase(nomeUsuario)) {
                senhaInvalida = true;
                System.out.println("ERRO: A senha não pode ser igual ao nome de usuário. Tente novamente.");
            } else {
                senhaInvalida = false;
                System.out.println("\nUsuário e senha cadastrados com sucesso!");
                System.out.println("Usuário: " + nomeUsuario);
                System.out.println("Senha: " + senha);
            }
            
        } while (senhaInvalida); // Repete enquanto a senha for inválida

        scanner.close();
    }
}