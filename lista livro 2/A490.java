import java.util.Scanner;

public class A490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palavra = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Palavra" + (i + 1) + ": ");
           palavra[i] = scanner.next();
        }
        System.out.print("Letra: ");
        char letra = scanner.next().charAt(0);

        for (int i = 0; i < 10; i++) {
           palavra[i] =palavra[i].replace(letra, '*');
        }

        System.out.println("Palavra modificada:");
        for (String palavras :palavra) {
            System.out.println(palavras);
        }
    }
} {
    
}
