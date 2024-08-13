public class No {
    int valor;
    No anterior;
    No proximo;

    this.valor=valor;this.anterior=null;this.proximo=null;
}

public class ListaDuplamenteEncadeada
No inicio;
No fim;

public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        System.out.println("Valor " + valor + " inserido na lista.");
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("A lista está vazia.");
            return;
        }

        No atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public boolean buscar(int valor) {
            No atual = inicio;
            while (atual != null) {
                if (atual.valor == valor) {
                    return true;
                }
                atual = atual.proximo;
            }
            return false;

    public void remover(int valor) {
        if (estaVazia()) {
            System.out.println("A lista está vazia. Não é possível remover o valor.");
            return;
        }

        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    fim = atual.anterior;
                }
                System.out.println("Valor " + valor + " removido da lista.");
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Valor " + valor + " não encontrado na lista.");
    }
}

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserir(742);
        lista.inserir(31);
        lista.inserir(24);

        System.out.println("Lista após inserções:");
        lista.exibir();

        int valorParaBuscar = 24;
        if (lista.buscar(valorParaBuscar)) {
            System.out.println("Valor " + valorParaBuscar + " encontrado na lista.");
        } else {
            System.out.println("Valor " + valorParaBuscar + " não encontrado na lista.");
        }

        lista.remover(31);
        System.out.println("Lista após remoção do número 31:");
        lista.exibir();

        lista.remover(999);
    }
}
