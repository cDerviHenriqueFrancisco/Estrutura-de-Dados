package ED1;
import java.util.Scanner;

public class Exc348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAlunos = 5;

        String[] nomes = new String[numAlunos];
        double[] notas1 = new double[numAlunos];
        double[] notas2 = new double[numAlunos];
        double[] medias = new double[numAlunos];

        preencherDadosAlunos(scanner, numAlunos, nomes, notas1, notas2, medias);
        exibirListagemAlunos(numAlunos, nomes, notas1, notas2, medias);

        scanner.close();
    }

    private static void preencherDadosAlunos(Scanner scanner, int numAlunos, String[] nomes, double[] notas1, double[] notas2, double[] medias) {
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            while (true) {
                try {
                    System.out.println("Digite a nota 1 do aluno " + (i + 1) + ": ");
                    notas1[i] = scanner.nextDouble();

                    System.out.println("Digite a nota 2 do aluno " + (i + 1) + ": ");
                    notas2[i] = scanner.nextDouble();

                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Por favor, digite um número válido.");
                    scanner.next();
                }
            }

            medias[i] = calcularMedia(notas1[i], notas2[i]);
        }
    }

    private static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    private static void exibirListagemAlunos(int numAlunos, String[] nomes, double[] notas1, double[] notas2, double[] medias) {
        System.out.println("\nListagem de Alunos:");
        System.out.printf("%-15s%-10s%-10s%-10s\n", "Nome", "Nota 1", "Nota 2", "Média");
        for (int i = 0; i < numAlunos; i++) {
            System.out.printf("%-15s%-10.2f%-10.2f%-10.2f\n", nomes[i], notas1[i], notas2[i], medias[i]);
        }
    }
}
