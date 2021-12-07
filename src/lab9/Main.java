package lab9;

public class Main
{
    public static void main(String[] args) {
        DivisionView view = new DivisionView();
        DivisionModel model = new DivisionModel();
        new DivisionController(view,model);
        view.setVisible(true);
    }
}
