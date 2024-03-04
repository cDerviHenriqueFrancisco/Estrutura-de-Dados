package ED1;

import java.util.Scanner;

public class Exc356 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAlunos = 15;

        String[] nomes = new String[numAlunos];
        double[] pr1 = new double[numAlunos];
        double[] pr2 = new double[numAlunos];
        double[] medias = new double[numAlunos];
        String[] situacao = new String[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            System.out.println("Digite a nota da PR1 do aluno " + (i + 1) + ": ");
            pr1[i] = scanner.nextDouble();

            System.out.println("Digite a nota da PR2 do aluno " + (i + 1) + ": ");
            pr2[i] = scanner.nextDouble();

            medias[i] = Math.round((pr1[i] + pr2[i]) / 2.0);

            situacao[i] = (medias[i] >= 6) ? "AP" : "RP";
        }

        System.out.println("\nListagem de Alunos:");
        System.out.printf("%-15s%-10s%-10s%-10s%-10s\n", "Nome", "PR1", "PR2", "Média", "Situação");

        for (int i = 0; i < numAlunos; i++) {
            System.out.printf("%-15s%-10.2f%-10.2f%-10.2f%-10s\n", nomes[i], pr1[i], pr2[i], medias[i], situacao[i]);
        }

        scanner.close();
    }
}
