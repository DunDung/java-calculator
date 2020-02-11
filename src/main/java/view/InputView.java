package view;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String input() {
        System.out.print("계산식을 입력하세요 : ");
        return scanner.nextLine().trim();
    }
}
