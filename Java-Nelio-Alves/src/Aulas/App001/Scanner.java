package Aulas.App001;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String x = sc.next();

        System.out.print("Quantos anos você tem? ");
        int y = sc.nextInt();

        System.out.print("Qual o seu salário? ");
        double z = sc.nextDouble();

        System.out.printf("Seu nome é %s, você tem %d e seu salário atual é R$%.2f", x, y, z);

        sc.close();
    }
}