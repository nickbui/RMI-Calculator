package Calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author nickbui
 */
public interface Calculator extends Remote
{
    double add(double operand1, double operand2) throws RemoteException;
}
