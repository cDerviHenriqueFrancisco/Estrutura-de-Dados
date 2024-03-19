import java.util.Scanner;

public class A460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        int dobroNumero1 = numero1 * 2;
        int dobroNumero2 = numero2 * 2;
        int dobroNumero3 = numero3 * 2;

        System.out.println("O dobro do primeiro número é: " + dobroNumero1);
        System.out.println("O dobro do segundo número é: " + dobroNumero2);
        System.out.println("O dobro do terceiro número é: " + dobroNumero3);
    }
}