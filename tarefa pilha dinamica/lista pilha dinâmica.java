import java.util.Scanner;

class Pilha<T> {
    private Node<T> topo;

    private static class Node<T> {
        private T valor;
        private Node<T> proximo;

        Node(T valor, Node<T> proximo) {
            this.valor = valor;
            this.proximo = proximo;
        }
    }

    public void empilhar(T valor) {
        topo = new Node<>(valor, topo);
    }

    public T desempilhar() {
        if (topo == null) {
            throw new IllegalStateException("Pilha vazia");
        }
        T valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }

    public boolean estaVazia() {
        return topo == null;
    }
}

public class VerificadorDeExpressao {

    public static boolean verificarExpressao(String expressao) {
        Pilha<Character> pilha = new Pilha<>();
        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pilha.empilhar(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pilha.estaVazia()) {
                    return false;
                }
                char topo = pilha.desempilhar();
                if (!ehParentezeCorreto(topo, c)) {
                    return false;
                }
            }
        }
        return pilha.estaVazia();
    }

    private static boolean ehParentezeCorreto(char aberto, char fechado) {
        return (aberto == '(' && fechado == ')') ||
                (aberto == '[' && fechado == ']') ||
                (aberto == '{' && fechado == '}');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a expressão para verificar: ");
        String expressao = scanner.nextLine();

        if (verificarExpressao(expressao)) {
            System.out.println("Expressão correta.");
        } else {
            System.out.println("Expressão incorreta.");
        }
    }
}
