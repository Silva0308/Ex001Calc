package Ex001Calc;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectFunction() {
        System.out.print("""
                --------------------------------------
                Выберите действие:
                --------------------------------------
                1. сложение
                2. вычитание
                3. деление
                4. умножение
                --------------------------------------
                0. Выход
                """);
        return scanner.nextLine();
    }

}
