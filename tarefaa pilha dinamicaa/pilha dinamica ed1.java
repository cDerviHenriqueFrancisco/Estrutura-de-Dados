import java.util.Scanner;
import java.util.Stack;

public class PilhasAlternadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();

        while (true) {
            System.out.print("Digite um número (-127 a 128, 0 para finalizar): ");
            int valor = scanner.nextInt();

            if (valor == 0) {
                break;
            } else if (valor % 2 == 0) {
                pilhaPar.push(valor);
            } else {
                pilhaImpar.push(valor);
            }
        }

        boolean removerDaImpar = true;
        while (!pilhaImpar.isEmpty() && !pilhaPar.isEmpty()) {
            if (removerDaImpar) {
                System.out.println("Retirado da pilha ÍMPAR: " + pilhaImpar.pop());
            } else {
                System.out.println("Retirado da pilha PAR: " + pilhaPar.pop());
            }
            removerDaImpar = !removerDaImpar;
        }

        if (!pilhaImpar.isEmpty()) {
            System.out.println("A pilha ÍMPAR ainda possui elementos:");
            System.out.println("Quantidade de elementos restantes na pilha ÍMPAR: " + pilhaImpar.size());
            System.out.println("Elementos restantes na pilha ÍMPAR: " + pilhaImpar);
        }

        if (!pilhaPar.isEmpty()) {
            System.out.println("A pilha PAR ainda possui elementos:");
            System.out.println("Quantidade de elementos restantes na pilha PAR: " + pilhaPar.size());
            System.out.println("Elementos restantes na pilha PAR: " + pilhaPar);
        }

        scanner.close();
    }
}
