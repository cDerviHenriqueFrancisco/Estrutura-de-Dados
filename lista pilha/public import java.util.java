public

import java.util.Stack;

public class Pilha {

    public static String inverterPalavras(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();
            
            for (char c : palavra.toCharArray()) {
                pilha.push(c);
            }
            a
            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }
            resultado.append(" "); 
        }

        
        resultado.deleteCharAt(resultado.length() - 1);

        return resultado.toString();
    }

    public static void main(String[] args) {

        String exemplo1 = "UM CIENTISTA DA COMPUTAÇAO OU UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E AIGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";

        System.out.println("Exemplo 1: " + inverterPalavras(exemplo1));
        System.out.println("Exemplo 2: " + inverterPalavras(exemplo2));
    }
}
