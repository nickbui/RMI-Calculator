package Calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author nickbui
 */
public interface Calculator extends Remote
{
    // Interface that defines the method for add, subtract, multiple, and divide signature
    double add(double operand1, double operand2) throws RemoteException;
    double subtract(double operand1, double operand2) throws RemoteException;
    double multiple(double operand1, double operand2) throws RemoteException;
    double divide(double operand1, double operand2) throws RemoteException;
}
