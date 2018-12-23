
package recursivedemo;

public class NegativeNumberException extends Exception{
    public NegativeNumberException() {
        
    }
    public NegativeNumberException (Throwable isNegative) {
        super(isNegative);
    }
}
