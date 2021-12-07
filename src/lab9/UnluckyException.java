package lab9;

public class UnluckyException extends Exception
{
    public UnluckyException(String message)
    {
        super(message);
    }

    public UnluckyException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
