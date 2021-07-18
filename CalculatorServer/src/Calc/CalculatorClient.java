/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calc;

import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author nickbui
 */
public class CalculatorClient
{
    public static void main(String[] args)
    {
        try{
            Calculator calc = (Calculator)Naming.lookup("rmi://localhost:1999/Calculator");
            System.out.println(calc.add(10, 5));
        } catch (RemoteException e){
            System.out.println("Remote exception: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
