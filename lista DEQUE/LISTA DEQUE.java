public class Pessoa {
    private int id;
    private char sexo;
    private int idade;
    private char gestante;
    private char lactante;
    private char necessidadeEspecial;

    public Pessoa(int id, char sexo, int idade, char gestante, char lactante, char necessidadeEspecial) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public int getId() {
        return id;
    }

    public int getPrioridade() {
        if (necessidadeEspecial == 's') return 3;
        if (gestante == 's' || lactante == 's') return 3;
        if (idade > 60) return 2;
        return 1;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Sexo: %c, Idade: %d, Gestante: %c, Lactante: %c, Necessidade Especial: %c",
                             id, sexo, idade, gestante, lactante, necessidadeEspecial);
    }
}

import java.util.*;

public class FilaCircular {
    private Deque<Pessoa> deque;

    public FilaCircular() {
        this.deque = new LinkedList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        deque.add(pessoa);
    }

    public Pessoa removerPessoa() {
        return deque.poll();
    }

    public boolean estaVazia() {
        return deque.isEmpty();
    }

    public void ordenarPorPrioridade() {
        List<Pessoa> lista = new ArrayList<>(deque);
        lista.sort((p1, p2) -> Integer.compare(p2.getPrioridade(), p1.getPrioridade()));
        deque.clear();
        deque.addAll(lista);
    }

    public List<Pessoa> obterPessoas() {
        return new ArrayList<>(deque);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular();
        Random random = new Random();

        // Criar 100 pessoas com base nas proporções especificadas
        int idPessoa = 1;

        for (int grupo = 1; grupo <= 10; grupo++) {
            int qtdNecessidadesEspeciais = 1;
            int qtdGestantes = 1;
            int qtdLactantes = 1;
            int qtdAcima60 = 3;
            int qtdNormais = 5;

            for (int i = 0; i < qtdNecessidadesEspeciais; i++) {
                adicionarPessoa(fila, idPessoa++, 's', random, 'n', 'n', 'n');
            }
            for (int i = 0; i < qtdGestantes; i++) {
                adicionarPessoa(fila, idPessoa++, 'n', random, 's', 'n', 'n');
            }
            for (int i = 0; i < qtdLactantes; i++) {
                adicionarPessoa(fila, idPessoa++, 'n', random, 'n', 's', 'n');
            }
            for (int i = 0; i < qtdAcima60; i++) {
                adicionarPessoa(fila, idPessoa++, 'n', random, 'n', 'n', 'n');
            }
            for (int i = 0; i < qtdNormais; i++) {
                adicionarPessoa(fila, idPessoa++, 'n', random, 'n', 'n', 'n');
            }
        }

        fila.ordenarPorPrioridade();

        List<Pessoa> atendidos = new ArrayList<>();
        List<Pessoa> naoAtendidos = new ArrayList<>();

        // Processar atendimento de até 100 pessoas
        int count = 0;
        while (!fila.estaVazia() && count < 100) {
            atendidos.add(fila.removerPessoa());
            count++;
        }

        naoAtendidos.addAll(fila.obterPessoas());

        // Exibir resultados
        System.out.println("Atendimentos realizados:");
        for (Pessoa pessoa : atendidos) {
            System.out.println(pessoa);
        }

        System.out.println("\nPessoas não atendidas:");
        for (Pessoa pessoa : naoAtendidos) {
            System.out.println(pessoa);
        }
    }

    private static void adicionarPessoa(FilaCircular fila, int id, char sexo, Random random, char gestante,
            char lactante, char necessidadeEspecial) {
        int idade = random.nextInt(91);
        Pessoa pessoa = new Pessoa(id, sexo, idade, gestante, lactante, necessidadeEspecial);
        fila.adicionarPessoa(pessoa);
    }
}
