package final_project;

import final_project.Model.Address;
import final_project.Model.Money;
import final_project.Model.Person;

public class MoneyDemo {

    public static void main(String[] args) {
        
        
        Address testAddress = new Address(" 237J Harvey Hall", "Menomonie", "WI", "54751");
        //CreditCard card1 = new CreditCard(1000, )
        System.out.println(testAddress);
        
        Person testPerson = new Person("Diane", "Christie", testAddress);
        System.out.println(testPerson);
        
        Money testAmount = new Money(500.00100);
        System.out.println("Current amount is " + testAmount);
        
        Money addingAmount = new Money(10.02);
        testAmount = testAmount.add(addingAmount);
        System.out.println("Adding " + addingAmount + " gives " + testAmount);
        
        Money substractingAmount = new Money(10.88);
        testAmount = testAmount.substract(substractingAmount);
        System.out.println("Substracting " + substractingAmount + " gives " + testAmount);
        
        Money compairingAmount = new Money(10.88);
        if (addingAmount.equals(compairingAmount)) {
            System.out.println(addingAmount + " equals " + compairingAmount);
        } else {
            System.out.println(addingAmount + " does not equal " + compairingAmount);
        }
    }
    
}
