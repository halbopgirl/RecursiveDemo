
package recursivedemo;
 import java.util.*;
public class RecursiveDemo {
    
    public static int calcExponent(int number, int raisedTo) {
        if (raisedTo == 0)
            return 1;
        else if (raisedTo == 1)
            return number;
        return calcExponent(number, raisedTo-1) * number;
    }

    public static void main(String[] args) throws InputMismatchException, 
            NumberFormatException {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("This program will find the value of an integer raised"
                + " to an exponent");
        
        try {
        System.out.println("Enter the number: ");
        int x = scanIn.nextInt();
        System.out.println("Enter your exponent: ");
        int exponent = scanIn.nextInt();
        if (exponent < 0) {
            throw new NegativeNumberException();
        }
        System.out.println(x + " raised to  the power of " + exponent + " is " 
                + calcExponent(x, exponent));
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("This is not an integer.");
        } catch (NegativeNumberException e) {
            System.out.println("Your exponent cannot be negative.");
        } finally {
            scanIn.close();
        }
    }
    
}
