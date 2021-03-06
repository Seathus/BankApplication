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
public class SavingsAccount extends Account
{
    
    SavingsAccount(Person person)
    {
        this.accountHolder = person;
        this.additionalCardHolders = new ArrayList<>();
    }
    
    @Override
    void Withdraw(float amount)
    {
        float withdrawFee = amount * 0.15f;     
        charges += withdrawFee;
        balance -= amount;
        if (balance <= 0)
        {
            System.out.println("You dont have enough funds to withdraw!");
            return;
        }
        
    }
    
    @Override
    void Deposit(float amount)
    {
        float depositInterest = amount * 0.01f;
        balance += amount + depositInterest;
    }
}
