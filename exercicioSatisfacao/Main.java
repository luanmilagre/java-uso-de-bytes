import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nivel;

        do {
            System.out.println("Digite o nível de satisfação (entre 1 e 5): ");
            nivel = scanner.nextInt();

            if (nivel < 1 || nivel > 5) {
                System.out.println("Opção inválida! Digite um número entre 1 e 5.");
            }

        } while (nivel < 1 || nivel > 5);

        String feedback = switch (nivel) {
            case 1 -> "Muito insatisfeito";
            case 2 -> "Insatisfeito";
            case 3 -> "Neutro";
            case 4 -> "Satisfeito";
            case 5 -> "Muito satisfeito";
            default -> "Opção inválida, deve estar entre 1 e 5";
        };

        System.out.println("A opção selecionada foi: " + nivel);
        System.out.println("O resultado da avaliação foi: " + feedback);

        scanner.close();
    }
}