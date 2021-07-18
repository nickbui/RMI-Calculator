package Calc;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author nickbui
 */
public class Main
{
    public static void main(String[] args)
    {
        try{
            Registry registry = LocateRegistry.createRegistry(1999);
            registry.rebind("Calculator", new CalculatorImpl());
            System.out.println("Server is Running");
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    
}
