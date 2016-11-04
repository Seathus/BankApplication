/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankApplication;

import java.util.ArrayList;

/**
 *
 * @author Tim
 */
public class CurrentAccount extends Account
{
    
    CurrentAccount(Person person)
    {
        this.accountHolder = person;
        this.additionalCardHolders = new ArrayList<>();
    }
    
    void PayFees()
    {
        balance -= charges;
    }
    
    @Override
    void Withdraw(float amount)
    {
        float overdraftFee = 0;
        float withdrawFee = amount * 0.05f;
        charges += withdrawFee + overdraftFee;
        balance -= amount;
        if (balance <= 0)
        {
            System.out.println("You are in overdraft!");
            overdraftFee = amount * 0.5f;
        }
        
    }
    
    @Override
    void Deposit(float amount)
    {
        balance += amount;
    }
    
    
    
}
