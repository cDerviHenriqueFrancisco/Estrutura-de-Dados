package ED1;
import java.util.Scanner;

public class Exc360 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dataNascimento;

        while (true) {
            System.out.println("Digite a data de nascimento (ddmm) ou 9999 para encerrar:");
            dataNascimento = scanner.nextInt();

            if (dataNascimento == 9999) {
                System.out.println("Programa encerrado.");
                break;
            }

            int dia = dataNascimento / 100;
            int mes = dataNascimento % 100;

            if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                System.out.println("Áries");
            } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                System.out.println("Touro");
            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                System.out.println("Gêmeos");
            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                System.out.println("Câncer");
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                System.out.println("Leão");
            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                System.out.println("Virgem");
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                System.out.println("Libra");
            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                System.out.println("Escorpião");
            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                System.out.println("Sagitário");
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                System.out.println("Capricórnio");
            } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                System.out.println("Aquário");
            } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                System.out.println("Peixes");
            } else {
                System.out.println("Data de nascimento inválida.");
            }
        }

        scanner.close();
    }
}