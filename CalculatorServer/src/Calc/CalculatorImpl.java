
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
    public double add(double operand1, double operand2) throws RemoteException{
        return operand1 + operand2;
    }
    
}
