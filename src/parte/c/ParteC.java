package parte.c;

import java.util.Scanner;

public class ParteC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da linha desejada: ");
        int line = scanner.nextInt();

        System.out.print("Digite o valor da coluna desejada: ");
        int column = scanner.nextInt();

        int whiteColor = 1, blackColor = 0;

        if ((line + column) % 2 == 0) {
            System.out.println("Você parou em uma casa de cor branca, valor: " + whiteColor);
        } else {
            System.out.println("Você parou em uma casa de cor preta, valor: " + blackColor);
        }
    }
}
