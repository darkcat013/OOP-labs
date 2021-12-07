package lab9;

public class DivisionModel
{
    public String divide(double dividend, double divisor) throws ArithmeticException
    {
        if(divisor == 0) throw new ArithmeticException("Division by zero");
        return String.valueOf(dividend/divisor);
    }
}
