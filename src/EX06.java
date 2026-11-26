public class EX06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Sem parênteses, o Java concatena tudo como texto
        System.out.println("Resultado: " + a + b);

        // Com parênteses, o Java soma primeiro e depois concatena
        System.out.println("Resultado: " + (a + b));
    }
}
