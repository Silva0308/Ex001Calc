package Ex001Calc;

import java.util.Scanner;

public class Presenter {
    SumController sumController;
    SubController subController;
    DivController divController;
    MultController multController;
    Menu menu;
    Scanner scanner;

    public Presenter(SumController sumController, SubController subController, DivController divController, MultController multController, Scanner scanner, Menu menu) {
        this.sumController = sumController;
        this.subController = subController;
        this.divController = divController;
        this.multController = multController;
        this.scanner = scanner;
        this.menu = menu;
    }

    public void start() {

        while (true) {
            switch (menu.selectFunction()) {
                case "1" -> // сложение
                        sumController.doSum();
                case "2" -> // вычитание
                        subController.doSub();
                case "3" -> // деление
                        divController.doDiv();
                case "4" -> // умножение
                        multController.doMult();
                case "0" -> // выход
                        System.exit(0);
                default -> System.out.println("Неверный ввод");
            }
        }
    }


}
