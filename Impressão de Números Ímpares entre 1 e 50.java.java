public class ImparesEntreUmECinquenta {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) { // Verifica se o resto da divisão por 2 não é zero (ímpar)
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}