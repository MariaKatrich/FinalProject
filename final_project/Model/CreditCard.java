package final_project.Model;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person owner, Money creditLimit) {
        this.creditLimit = creditLimit;
        this.owner = owner;
        this.balance = new Money(0);
    }
    

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public String getOwner() {
        return owner.toString();
    }
    
    public String getPersonals() {
        return owner.getFirstName() + " " + owner.getLastName() + ", " + owner.getHome();
    }
    
    public void charge(Money amount) {
        //System.out.println("Attemptig to charge " + amount);
        if (balance.add(amount).compareTo(creditLimit)  > 0) {
            System.out.println("Exceeds credit limit");
        } else {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        }
        //System.out.println("Balance: " + balance);
    }
    
    public void payment(Money amount) {
        //System.out.println("Attempting to pay " + amount);
        balance = balance.substract(amount);
        System.out.println("Payment: " + amount);
        //System.out.println("Balance: " + balance);
    }
}
