package ED1;
import java.util.Scanner;

public class Exc358 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPessoas = 20;

        String[] nomes = new String[numPessoas];
        int[] idades = new int[numPessoas];

        String[] nomesFiltrados = new String[numPessoas];
        int filteredNamesCount = 0;

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            while (true) {
                try {
                    System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
                    idades[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite uma idade válida.");
                }
            }

            char primeiraLetra = Character.toUpperCase(nomes[i].charAt(0));
            if (primeiraLetra >= 'L' && primeiraLetra <= 'S') {
                nomesFiltrados[filteredNamesCount] = nomes[i];
                filteredNamesCount++;
            }
        }

        System.out.println("\nNomes no intervalo L - S:");
        for (int i = 0; i < filteredNamesCount; i++) {
            System.out.println(nomesFiltrados[i]);
        }

        scanner.close();
    }
}
