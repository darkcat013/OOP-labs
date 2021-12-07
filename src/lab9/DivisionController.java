package lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionController
{
    private DivisionView divisionView;
    private DivisionModel divisionModel;
    public DivisionController(DivisionView divisionView, DivisionModel divisionModel)
    {
        this.divisionView = divisionView;
        this.divisionModel = divisionModel;
        this.divisionView.addDivideListener(new DivideListener());
    }
    class DivideListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                JOptionPane.showMessageDialog(null, "Result: " + divisionModel.divide(divisionView.getDividend(),divisionView.getDivisor()));
            }
            catch (NumberFormatException | UnluckyException | ArithmeticException er)
            {
                JOptionPane.showMessageDialog(null,er.getMessage());
            }
            catch (Exception er)
            {
                JOptionPane.showMessageDialog(null, "Unhandled exception: "+er.getMessage());
            }
        }
    }
}
