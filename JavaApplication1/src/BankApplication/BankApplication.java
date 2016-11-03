/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankApplication;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class BankApplication {
   
    static AccountManager accountManager = new AccountManager();
    static Scanner reader = new Scanner(System.in);
    static BankApplication o = new BankApplication();
    
    public static void Create()
    {
        System.out.println("Enter name:");
        String name = reader.next();
        System.out.println("Enter age:");
        int age = reader.nextInt();
        System.out.println("Enter address:");
        String address = reader.next();
        System.out.println("What kind of account do you want to open?" + "\n" + "1. Current Account" + "\n" + "2. Savings Account");
        int input = reader.nextInt();
        switch (input)
        {
            case 1:
               accountManager.CreateCurrentAccount(name, age, address); 
               break;
            case 2:
               accountManager.CreateSavingstAccount(name, age, address);
               break;
        }
        
        String[] temp = {"sdfsdf"};
        o.main(temp);
    }
    
    public static void Access()
    {
        System.out.println("Enter account number:");
        int searchCrit = reader.nextInt();
        Account account  = accountManager.AccessAccount(searchCrit);
        if (account == null) return;
        
        System.out.println("Choose the following:" + "\n" + 
                "0. Display Balance" +"\n" + 
                "1. Withdraw" + "\n" + 
                "2. Deposit" + "\n" + 
                "3. Amend Account" + "\n" + 
                "4. Add additional card holder." + "\n" + 
                "5. Remove additional card holder" + "\n" + 
                "6. Exit");
        
        int choice = reader.nextInt();
        switch (choice)
        {
            case 0:
                System.out.println("Your balance is: " + account.balance);
                break;
            case 1:
                System.out.println("How much would you like to withdraw?");
                float withdrawAmount = reader.nextFloat();
                account.Withdraw(withdrawAmount);
                break;
            case 2:
                System.out.println("How much would you like to deposit?");
                float depositAmount = reader.nextFloat();
                account.Deposit(depositAmount);
                break;
            case 3:
                System.out.println("What would you like to amend?" + "\n" + "1. Name" + "\n" + "2. Age"+ "\n" + "3. Address");
                int input = reader.nextInt();
                switch (input)
                {
                    case 1:
                        System.out.println("Enter new name");
                        String newName = reader.next();
                        account.accountHolder.AmendName(newName);
                        break;
                    case 2:
                        System.out.println("Enter new age");
                        int newAge = reader.nextInt();
                        account.accountHolder.AmendAge(newAge);
                        break;
                    case 3:
                        System.out.println("Enter new Address");
                        String newAddress = reader.next();
                        account.accountHolder.AmendName(newAddress);
                        break;
                    default:
                        System.out.println("Please enter values 1 - 3");
                        break;
                }
                break;
            case 4:
                System.out.println("Enter name:");
                String name = reader.next();
                System.out.println("Enter age:");
                int age = reader.nextInt();
                System.out.println("Enter address:");
                String address = reader.next();
                Person newCardHolder = new Person(name, age, address);
                account.AddAdditionalCardholder(newCardHolder);
                break;
            case 5:
                System.out.println("Enter name:");
                String searchName = reader.next();
                account.RemoveAdditionalCardholder(searchName);
                break;
            case 6:
                String[] temp = {"sdfsdf"};
                o.main(temp);
                break;
            default:
                System.out.println("Please enter values 1 - 6");
                break;
        }
        o.Access();
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Choose the following:" + "\n" + "1. Create Account" + "\n" + "2. Access Account");
        int choice = reader.nextInt();
        
        switch (choice)
        {
            case 1:
                Create();
                break;
            case 2:
                Access();                
                break;
            default:
                System.out.println("Please enter values 1 - 2");
                String[] temp = {"sdfsdf"};
                o.main(temp);
                break;
        }
    }
    
}
