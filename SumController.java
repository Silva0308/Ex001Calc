package Ex001Calc;

public class SumController {
    View view;
    SumModel model;

    public SumController(View view, SumModel model) {
        this.view = view;
        this.model = model;
    }

    public void doSum(){
        int a = view.getValue();
        int b = view.getValue();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Сумма: ");
    }
}
