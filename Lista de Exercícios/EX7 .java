public class Main {

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila {
    private Queue<Integer> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void enqueue(int elemento) {
        fila.add(elemento);
    }

    public int dequeue() {
        return fila.poll();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    @Override
    public String toString() {
        return fila.toString();
    }

    public void inverterFila() {
        Stack<Integer> pilha = new Stack<>();

        while (!isEmpty()) {
            pilha.push(dequeue());
        }

        while (!pilha.isEmpty()) {
            enqueue(pilha.pop());
        }
    }
}

}

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        for (int i = 1; i <= 20; i++) {
            fila.enqueue(i);
        }

        System.out.println("Fila Original: " + fila);

        fila.inverterFila();

        System.out.println("Fila Invertida: " + fila);
    }
}
