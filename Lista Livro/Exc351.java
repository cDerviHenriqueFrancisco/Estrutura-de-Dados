package ED1;

import java.util.Scanner;

public class Exc351 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        preencherNomes(scanner, nomes);

        System.out.println("Digite um número correspondente a uma pessoa (1 a 5): ");

        if (scanner.hasNextInt()) {
            int numeroPessoa = scanner.nextInt();

            exibirNomePessoa(numeroPessoa, nomes);
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }

    private static void preencherNomes(Scanner scanner, String[] nomes) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
    }

    private static void exibirNomePessoa(int numeroPessoa, String[] nomes) {
        if (numeroPessoa >= 1 && numeroPessoa <= 5) {
            System.out.println("Nome da pessoa " + numeroPessoa + ": " + nomes[numeroPessoa - 1]);
        } else {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 5.");
        }
    }
}
