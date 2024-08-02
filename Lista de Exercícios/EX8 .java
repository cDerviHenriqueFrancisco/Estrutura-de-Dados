public

import java.util.Stack;

public class Pilha {
    private Stack<Integer> stack;

    public Pilha() {
        stack = new Stack<>();
    }

    public void push(int elemento) {
        stack.push(elemento);
    }

    public Integer pop() {
        return stack.isEmpty() ? null : stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    
    public Integer peek() {
        return stack.isEmpty() ? null : stack.peek();
    }
    
    @Override
    public String toString() {
        return stack.toString();
    }
}

import java.util.Random;

public class TestaPilha {
    private Pilha pilhaP;
    private Pilha pilhaN;

    public TestaPilha() {
        pilhaP = new Pilha();
        pilhaN = new Pilha();
    }

    public void processarNumero(int numero) {
        if (numero > 0) {
            pilhaP.push(numero);
        } else if (numero < 0) {
            pilhaN.push(numero);
        } else {

            Integer p = pilhaP.pop();
            Integer n = pilhaN.pop();
            System.out.println("Número zero: " + numero + ", Elemento da pilha P: " + (p != null ? p : "Vazio")
                    + ", Elemento da pilha N: " + (n != null ? n : "Vazio"));
        }
    }

    public void gerarEProcessarNumeros() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100;
            processarNumero(numero);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TestaPilha testaPilha = new TestaPilha();
        testaPilha.gerarEProcessarNumeros();
    }
}
