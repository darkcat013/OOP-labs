package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DivisionView extends JFrame
{
    private JLabel dividendLabel = new JLabel("  Dividend: ");
    private JLabel divisorLabel = new JLabel("  Divisor: ");
    private JTextField dividendTextField = new JTextField();
    private JTextField divisorTextField = new JTextField();
    private JButton divide = new JButton("Divide");

    public DivisionView()
    {
        setTitle("Lab 9");
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));
        setSize(300, 120);
        add(dividendLabel);
        add(dividendTextField);
        add(divisorLabel);
        add(divisorTextField);
        add(divide);
    }

    public void addDivideListener(ActionListener listener)
    {
        divide.addActionListener(listener);
    }

    public double getDividend() throws NumberFormatException
    {
        String dividendText = dividendTextField.getText().trim();
        if(dividendText.isEmpty())
        {
            throw new NumberFormatException("Input for dividend is empty");
        }
        double dividend;
        try
        {
            dividend = Double.parseDouble(dividendText);
        }
        catch (NumberFormatException er)
        {
            throw new NumberFormatException("Dividend contains non-numerical values.");
        }

        return dividend;
    }

    public double getDivisor() throws NumberFormatException, UnluckyException
    {
        String divisorText = divisorTextField.getText().trim();
        if(divisorText.isEmpty())
        {
            throw new NumberFormatException("Input for divisor is empty");
        }
        double divisor;
        try
        {
            divisor = Double.parseDouble(divisorText);
        }
        catch (NumberFormatException er)
        {
            throw new NumberFormatException("Divisor contains non-numerical values.");
        }
        if(divisor == 13)
        {
            throw new UnluckyException("Unlucky!");
        }
        return divisor;
    }
}
