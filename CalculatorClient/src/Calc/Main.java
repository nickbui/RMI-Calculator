package Calc;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author nickbui
 */


/**
 *
 * @author nickbui
 */
public class Main
{
    public static void main(String[] args)
    {
        try{
            // Creates the object calc and calls the object remote's method add, subtract, multiple, and divide from port 1999
            Calculator calc = (Calculator)Naming.lookup("rmi://localhost:1999/Calculator");
            //Add two numbers RMI call
            System.out.println("Addition: " + calc.add(10, 5));
            
            //Subtract two numbers RMI call
            System.out.println("Subtraction: "+ calc.subtract(15, 10));
            
            //Multiple two numbers RMI call
            System.out.println("Multiplication: "+ calc.multiple(9, 3));
            
            //Divide two numbers RMI call
            System.out.println("Division: "+ calc.divide(42, 7));
        } catch (RemoteException e){
            System.out.println("Remote exception: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}