import java.util.Scanner;
import java.util.Stack;

public class Calculadora {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.println("Digite:");
        System.out.println(" 1 - infixa.");
        System.out.println(" 2 - pos-fixa.");
        System.out.println(" 3 - pre-fixa.");
        int a = nm.nextInt();

        if (a == 1) {
            System.out.print("Digite a expressão infixa: ");
            String expressaoInfixa = nm.next();
            String expressaoPosFixa = infixToPostfix(expressaoInfixa);
            System.out.println("Expressão pós-fixa: " + expressaoPosFixa);
            int resultado = avaliarPosFixa(expressaoPosFixa);
            System.out.println("Resultado (pós-fixa): " + resultado);
            int resultadoInfixa = avaliarInfixa(expressaoInfixa);
            System.out.println("Resultado (infixa): " + resultadoInfixa);
            String expressaoPreFixa = infixToPrefix(expressaoInfixa);
            System.out.println("Expressão pré-fixa: " + expressaoPreFixa);
        } else if (a == 2) {
            System.out.print("Digite a expressão pós-fixa: ");
            String expressaoPosFixa = nm.next();
            int resultado = avaliarPosFixa(expressaoPosFixa);
            System.out.println("Resultado (pós-fixa): " + resultado);
        } else if (a == 3) {
            System.out.print("Digite a expressão pré-fixa: ");
            String expressaoPreFixa = nm.next();
            int resultado = avaliarPreFixa(expressaoPreFixa);
            System.out.println("Resultado (pré-fixa): " + resultado);
        }
    }

    public static String infixToPostfix(String infix) {

        infix = infix.replaceAll("\\s+", "");

        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static String infixToPrefix(String infix) {

        infix = infix.replaceAll("\\s+", "");

        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        infix = new StringBuilder(infix).reverse().toString();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                prefix.append(c);
            } else if (c == ')') {
                stack.push(c);
            } else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
                    prefix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        return prefix.reverse().toString();
    }

    public static int avaliarPosFixa(String posFixa) {
        Stack<Integer> stack = new Stack<>();

        for (char c : posFixa.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int operando2 = stack.pop();
                int operando1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(operando1 + operando2);
                        break;
                    case '-':
                        stack.push(operando1 - operando2);
                        break;
                    case '*':
                        stack.push(operando1 * operando2);
                        break;
                    case '/':
                        stack.push(operando1 / operando2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static int avaliarInfixa(String infixa) {
        String posFixa = infixToPostfix(infixa);
        return avaliarPosFixa(posFixa);
    }

    public static int avaliarPreFixa(String preFixa) {
        Stack<Integer> stack = new Stack<>();

        for (int i = preFixa.length() - 1; i >= 0; i--) {
            char c = preFixa.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int operando1 = stack.pop();
                int operando2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(operando1 + operando2);
                        break;
                    case '-':
                        stack.push(operando1 - operando2);
                        break;
                    case '*':
                        stack.push(operando1 * operando2);
                        break;
                    case '/':
                        stack.push(operando1 / operando2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
}
