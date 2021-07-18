
package Calc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author nickbui
 */
public class CalculatorImpl extends UnicastRemoteObject implements Calculator
{
    public CalculatorImpl() throws RemoteException{
    }
    
    //add method implementation that performs addition on the two values and returns the result
    public double add(double operand1, double operand2) throws RemoteException{
        return operand1 + operand2;
    }
    //subtract method implementation that performs subtraction on the two values and returns the result
    public double subtract(double operand1, double operand2) throws RemoteException{
        return operand1 - operand2;
    }
    //multiple method implementation that performs multiplication on the two values and returns the result
    public double multiple(double operand1, double operand2) throws RemoteException{
        return operand1 * operand2;
    }
    //divide method implementation that performs division on the two values and returns the result
    public double divide(double operand1, double operand2) throws RemoteException{
        return operand1 / operand2;
    }
}
