import java.util.Scanner;

public class ValidacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        boolean notaValida;

        // O loop 'do-while' garante que o código dentro do 'do' será executado
        // pelo menos uma vez, e continuará repetindo 'while' a condição for verdadeira.
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            
            // Verifica se o próximo token é um double
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                
                // Condição de validação: nota deve ser maior ou igual a 0 E menor ou igual a 10
                if (nota >= 0 && nota <= 10) {
                    notaValida = true;
                    System.out.println("Nota válida inserida: " + nota);
                } else {
                    notaValida = false;
                    System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
                }
            } else {
                notaValida = false;
                System.out.println("Entrada inválida! Por favor, digite um número.");
                // Limpa o buffer do scanner para evitar loop infinito de erro de tipo
                scanner.next(); 
                nota = -1; // Atribui um valor inválido para manter a condição do loop
            }
            
        } while (!notaValida); // Repete enquanto a nota NÃO for válida

        scanner.close();
    }
}