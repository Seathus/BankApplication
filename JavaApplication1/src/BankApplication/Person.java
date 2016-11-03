/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankApplication;

/**
 *
 * @author Tim
 */
public class Person {
    
    private String name;
    private int age;
    private String address;
    
    Person()
    {
        
    }
    
    Person(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public String GetName()
    {
        return this.name;
    }
    
    public int GetAge()
    {
        return this.age;
    }
    
    public String GetAddress()
    {
        return this.address;
    }
    
    public void AmendName(String name)
    {
        this.name = name;
    }
    
    public void AmendAge(int age)
    {
        this.age = age;
    }
    
    public void AmendAddress(String address)
    {
        this.address = address;
    }
}
