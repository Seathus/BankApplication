/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankApplication;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Tim
 */
public class AccountManager {
    
    private ArrayList<Account> accounts;
    
    AccountManager()
    {
        accounts = new ArrayList<>();
    }
    
    public void CreateCurrentAccount(String name, int age, String address)
    {
        Random randomGenerator = new Random();
        Person person = new Person(name, age, address);
        Account account = new CurrentAccount(person);
        account.accountNumber = randomGenerator.nextInt(99999999);
        accounts.add(account);
        System.out.println("Account " + account.accountNumber +" created.");
    }
    
    public void CreateSavingstAccount(String name, int age, String address)
    {
        Random randomGenerator = new Random();
        Person person = new Person(name, age, address);
        Account account = new SavingsAccount(person);
        account.accountNumber = randomGenerator.nextInt(99999999);
        accounts.add(account);
        System.out.println("Account " + account.accountNumber +" created.");
    }
    
    public Account AccessAccount(int searchCrit)
    {
        for (int i = 0; i < accounts.size(); i++) 
        {
            if (accounts.get(i).GetAccountNumber() == searchCrit)
            {
                return accounts.get(i);
            }
            else
            {
                System.out.println("Account not found.");
                return null;
            }
            
        }
        return null;
        
    }
    
}
