public class CrescimentoPopulacional {
    public static void main(String[] args) {
        double popA = 80000;
        double taxaA = 0.03;
        double popB = 200000;
        double taxaB = 0.015;
        int anos = 0;

        System.out.printf("População Inicial A: %.0f (Crescimento: %.1f%%%n", popA, taxaA * 100);
        System.out.printf("População Inicial B: %.0f (Crescimento: %.1f%%%n", popB, taxaB * 100);
        System.out.println("----------------------------------------");

        while (popA < popB) {
            popA = popA * (1 + taxaA);
            popB = popB * (1 + taxaB);
            anos++;
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("População Final A: %.0f%n", popA);
        System.out.printf("População Final B: %.0f%n", popB);
        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou se iguale à população do país B.");
    }
}