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
            //Starts a litening registry service port on port 1999
            Registry registry = LocateRegistry.createRegistry(1999);
            
            //Binds the implementation which contain the method implementations
            registry.rebind("Calculator", new CalculatorImpl());
            System.out.println("Server is Running");
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    
}
