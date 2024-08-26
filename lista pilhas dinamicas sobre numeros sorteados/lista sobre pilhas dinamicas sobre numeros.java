
import java.util.Random;
import java.util.Stack;

public class PilhasAleatorias {

    public static void main(String[] args) {

        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(9) + 1;
            if (num >= 1 && num <= 3) {
                pilha1.push(num);
            } else if (num >= 4 && num <= 6) {
                pilha2.push(num);
            } else {
                pilha3.push(num);
            }
        }
        int numSorteado;
        for (int i = 0; i < 100; i++) {

            numSorteado = rand.nextInt(3) + 1;
            System.out.println("Número sorteado para a pilha: " + numSorteado);

            if (pilha1.isEmpty() || pilha2.isEmpty() || pilha3.isEmpty()) {
                System.out.println("O programa foi encerrado porque uma das pilhas está vazia");
                break;
            }

            Integer topoPilha1 = pilha1.isEmpty() ? null : pilha1.peek();
            Integer topoPilha2 = pilha2.isEmpty() ? null : pilha2.peek();
            Integer topoPilha3 = pilha3.isEmpty() ? null : pilha3.peek();

            Stack<Integer> pilhaDestino = null;
            if (numSorteado == 1) {
                pilhaDestino = pilha1;
            } else if (numSorteado == 2) {
                pilhaDestino = pilha2;
            } else if (numSorteado == 3) {
                pilhaDestino = pilha3;
            }

            if (pilhaDestino == pilha1) {
                if (topoPilha2 != null) {
                    System.out.println("Empilhando o número " + topoPilha2 + " na pilha 1");
                    pilhaDestino.push(pilha2.pop());
                }
                if (topoPilha3 != null) {
                    System.out.println("Empilhando o número " + topoPilha3 + " na pilha 1");
                    pilhaDestino.push(pilha3.pop());
                }
            } else if (pilhaDestino == pilha2) {
                if (topoPilha1 != null) {
                    System.out.println("Empilhando o número " + topoPilha1 + " na pilha 2");
                    pilhaDestino.push(pilha1.pop());
                }
                if (topoPilha3 != null) {
                    System.out.println("Empilhando o número " + topoPilha3 + " na pilha 2");
                    pilhaDestino.push(pilha3.pop());
                }
            } else if (pilhaDestino == pilha3) {
                if (topoPilha1 != null) {
                    System.out.println("Empilhando o número " + topoPilha1 + " na pilha 3");
                    pilhaDestino.push(pilha1.pop());
                }
                if (topoPilha2 != null) {
                    System.out.println("Empilhando o número " + topoPilha2 + " na pilha 3");
                    pilhaDestino.push(pilha2.pop());
                }
            }

            System.out.println("Pilha 1: " + pilha1);
            System.out.println("Pilha 2: " + pilha2);
            System.out.println("Pilha 3: " + pilha3);
        }

        if (pilha1.isEmpty() || pilha2.isEmpty() || pilha3.isEmpty()) {
            System.out.println("O programa foi encerrado porque uma das pilhas está vazia");
        } else {
            System.out.println("Número máximo de operações alcançado (100 operações)");
        }
    }
}
