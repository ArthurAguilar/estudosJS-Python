package Aulas.EstruturasRepetitivas;
import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.printf("A soma total foi de %d", soma);
        sc.close();
    }
}
