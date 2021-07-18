package Calc;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nickbui
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
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
