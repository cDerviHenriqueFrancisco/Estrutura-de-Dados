 EX5.java {

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

    public Fila inverterFila() {
        Fila filaInvertida = new Fila();
        Stack<Integer> pilha = new Stack<>();

        while (!this.isEmpty()) {
            pilha.push(this.dequeue());
        }

        while (!pilha.isEmpty()) {
            filaInvertida.enqueue(pilha.pop());
        }

        return filaInvertida;
    }

    @Override
    public String toString() {
        return fila.toString();
    }
}


public class Main {
    public static void main(String[] args) {

        Fila filaOriginal = new Fila();
        for (int i = 0; i < 100; i++) {
            filaOriginal.enqueue((int) (Math.random() * 1000));
        }

        System.out.println("Fila Original: " + filaOriginal);

        Fila filaInvertida = filaOriginal.inverterFila();

        System.out.println("Fila Invertida: " + filaInvertida);
    }
}
