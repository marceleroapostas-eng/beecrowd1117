
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota1 = -1;
        double nota2 = -1;

        while (nota1 < 0 || nota1 > 10) {
            nota1 = leitor.nextDouble();

            if (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
            }
        }

        while (nota2 < 0 || nota2 > 10) {
            nota2 = leitor.nextDouble();

            if (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
            }
        }

        double media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f%n", media);

        leitor.close();

    }
}
