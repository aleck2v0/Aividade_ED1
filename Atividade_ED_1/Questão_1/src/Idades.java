public class Idades{
    public static void main(String[] args) {
        int[] idades = {15, 22, 17, 30, 19, 12, 45, 18, 20, 16};

        System.out.println("Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }
    }
}