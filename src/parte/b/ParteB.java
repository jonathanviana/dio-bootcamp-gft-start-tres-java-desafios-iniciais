package parte.b;

import java.util.Scanner;

public class ParteB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int value = scanner.nextInt();

        System.out.println("Os valores que retornam o resto 2 são: ");
        for (int i = 1; i <= 10000; i++) {
            if (i % value == 2) {
                System.out.println(i + "-");
            }
        }
        scanner.close();
    }
}
