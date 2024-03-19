 import java.util.Scanner;

public class A470 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrime(num)) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
} {
    
}
