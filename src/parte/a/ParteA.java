package parte.a;

import java.util.Scanner;

public class ParteA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int firstValue = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int secondValue = scanner.nextInt();

        int multiplication = firstValue * secondValue;

        System.out.print("A multiplicação dos valores é = " + multiplication);
        scanner.close();
    }
}
