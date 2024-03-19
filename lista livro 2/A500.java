import java.util.Arrays;
import java.util.Scanner;

public class A500 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        boolean sair = false;

        while (!sair) {
            System.out.println("Menu:");
            System.out.println("1 - Digitar os dados do vetor A");
            System.out.println("2 - Digitar os dados do vetor B");
            System.out.println("3 - Imprimir os vetores");
            System.out.println("4 - Somar os vetores");
            System.out.println("5 - Subtrair os vetores");
            System.out.println("6 - Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite os elementos do vetor A:");
                    for (int i = 0; i < vetorA.length; i++) {
                        vetorA[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Digite os elementos do vetor B:");
                    for (int i = 0; i < vetorB.length; i++) {
                        vetorB[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("Vetor A: " + Arrays.toString(vetorA));
                    System.out.println("Vetor B: " + Arrays.toString(vetorB));
                    break;
                case 4:
                    int[] soma = new int[5];
                    for (int i = 0; i < vetorA.length; i++) {
                        soma[i] = vetorA[i] + vetorB[i];
                    }
                    System.out.println("Soma dos vetores: " + Arrays.toString(soma));
                    break;
                case 5:
                    int[] subtracao = new int[5];
                    for (int i = 0; i < vetorA.length; i++) {
                        subtracao[i] = vetorA[i] - vetorB[i];
                    }
                    System.out.println("Subtração dos vetores: " + Arrays.toString(subtracao));
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
} {
    
}
