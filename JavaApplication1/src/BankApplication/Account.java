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
public abstract class Account {
    
    protected float charges;
    public int accountNumber;
    protected float balance;
    protected Person accountHolder;
    protected ArrayList<Person> additionalCardHolders;
    private int maxAccountHolderNum = 5;
    
    public void Account(Person accountHolder)
    {
        this.accountHolder = accountHolder;
        
    }
    
    abstract void Withdraw(float amount);
    abstract void Deposit(float amount);
    
    public int GetAccountNumber()
    {
        return accountNumber;
    }
    
    public void AddAdditionalCardholder(Person person)
    {
        additionalCardHolders.add(person);
    }
    
    public void RemoveAdditionalCardholder(String personName)
    {
        for (int i = 0; i < additionalCardHolders.size(); i++) 
        {
            if (personName.equals(additionalCardHolders.get(i).GetName()))
            {
                additionalCardHolders.remove(i);
            }
            else
            {
                System.out.println("Person not found on account.");
            }
        }
    }
    
    
    
    
}
