import java.util.Scanner;

public class A480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (isPalindrome(numero)) {
            System.out.println("O número é capicua.");
        } else {
            System.out.println("O número não é capicua.");
        }
    }
    
    public static boolean isPalindrome(int numero) {
        int numeroreverso = 0;
        int numerooriginal = numero;
        
        while (numero != 0) {
            int digit = numero % 10;
            numeroreverso = numeroreverso * 10 + digit;
            numero /= 10;
        }
        
        return numerooriginal == numeroreverso;
    }
 
}
