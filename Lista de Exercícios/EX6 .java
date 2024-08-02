public class Main {

import java.util.LinkedList;
import java.util.Queue;

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
}

}

import java.util.Stack;

public class Pilha {
    private Stack<Integer> pilha;

    public Pilha() {
        pilha = new Stack<>();
    }

    public void push(int elemento) {
        pilha.push(elemento);
    }

    public int pop() {
        return pilha.pop();
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    public int peek() {
        return pilha.peek();
    }

   @Override
    public String toString() {
        return pilha.toString();
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            fila.enqueue(random.nextInt(1000) + 1);
            fila.enqueue(-(random.nextInt(1000) + 1));
        }

        while (!fila.isEmpty()) {
            int num = fila.dequeue();
            if (num > 0) {
                // Se o número é positivo, empilha-o
                pilha.push(num);
            } else {
                // Se o número é negativo, imprime e retira o número do topo da pilha
                if (!pilha.isEmpty()) {
                    System.out.println("Número negativo: " + num + ", Topo da pilha: " + pilha.pop());
                } else {
                    System.out.println("Número negativo: " + num + ", Pilha vazia, não há nada para retirar.");
                }
            }
        }
    }
}
