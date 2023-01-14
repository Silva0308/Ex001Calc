package Ex001Calc;

public class MultController {
    View view;
    MultModel multModel;

    public MultController(View view, MultModel multModel) {
        this.view = view;
        this.multModel = multModel;
    }

    public void doMult(){
        int a = view.getValue();
        int b = view.getValue();
        multModel.setX(a);
        multModel.setY(b);
        int result = multModel.result();
        view.print(result, "Произведение: ");
    }
}
