public class EX09 {
    public static void main(String[] args) {
        double notaDecimal = 9.8;
        int notaInteira = (int) notaDecimal;

        // A parte decimal (.8) foi truncada (descartada sem arredondamento), restando apenas 9.
        System.out.println("Valor original (double): " + notaDecimal);
        System.out.println("Valor convertido (int): " + notaInteira);
    }
}
