package ED1;
import java.util.Scanner;

public class Exc346 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;

        do {
            exibirMenu();
            escolha = scan.nextInt();
            realizarOperacao(escolha, scan);

        } while (escolha != 4);

        scan.close();
    }

    private static void exibirMenu() {
        System.out.println("MENU");
        System.out.println("1 - Imprime o comprimento da frase");
        System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
        System.out.println("3 - Imprime a frase espelhada");
        System.out.println("4 - Termina o algoritmo");
        System.out.print("OPÇÃO: ");
    }

    private static void realizarOperacao(int escolha, Scanner scan) {
        switch (escolha) {
            case 1:
                imprimirComprimentoDaFrase(scan);
                break;
            case 2:
                imprimirDoisPrimeirosEDoisUltimosCaracteres(scan);
                break;
            case 3:
                imprimirFraseEspelhada(scan);
                break;
            case 4:
                System.out.println("Fim do algoritmo");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void imprimirComprimentoDaFrase(Scanner scan) {
        System.out.print("Digite uma frase: ");
        String frase = scan.next();
        int comprimento = frase.length();
        System.out.println("Número de Caracteres da frase: " + comprimento);
    }

    private static void imprimirDoisPrimeirosEDoisUltimosCaracteres(Scanner scan) {
        System.out.print("Digite uma frase: ");
        String frase = scan.next();
        String resultado = (frase.length() >= 4) ? frase.substring(0, 2) + frase.substring(frase.length() - 2) : frase;
        System.out.println("Dois primeiros e dois últimos caracteres: " + resultado);
    }

    private static void imprimirFraseEspelhada(Scanner scan) {
        System.out.print("Digite uma frase: ");
        String frase = scan.next();
        StringBuilder fraseEspelhada = new StringBuilder(frase).reverse();
        System.out.println(fraseEspelhada);
    }
}
