package Ex001Calc;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        View v = new View();
        Presenter p = new Presenter(new SumController(v, new SumModel()), new SubController(v, new SubModel()), new DivController(v, new DivModel()),new MultController(v, new MultModel()), scanner, new Menu(scanner));
        p.start();


    }
}
