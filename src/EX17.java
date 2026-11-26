public class EX17 {
    public static void main(String[] args) {
        double subtotal = 500.00;
        double desconto = subtotal * 0.15;
        double total = subtotal - desconto;

        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Desconto (15%%): R$ %.2f%n", desconto);
        System.out.printf("Total a pagar: R$ %.2f%n", total);
    }
}
