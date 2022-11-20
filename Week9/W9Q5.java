abstract class Account {
    private int id = 0;
     String Account_holder_name;
     String address;

    Account(String name, String add) {
        id = id + 1;
        Account_holder_name = name;
        address = add;
    }

    abstract void deposit();

    abstract void withdraw();

}

class savings extends Account {
    final int min_balance;

    savings(String name, String add) {
        super(name, add);
        min_balance = 500;
    }

    void display() {
        System.out.println("Name :" +Account_holder_name);
        System.out.println("Address :" + address);
    }

    void deposit() {
        System.out.println("Depositing is Savings account");

    }

    void withdraw() {
        System.out.println("Withdrawing from Savings account");
    }
}

class current extends Account{
    final int max_withdrawl_limit;
    current(String name, String add){
        super(name, add);
        max_withdrawl_limit = 1000000;
    }
    void display() {
        System.out.println("Name :" +Account_holder_name);
        System.out.println("Address :" + address);
    }

    void deposit() {
        System.out.println("Depositing is Current account");
    }

    void withdraw() {
        System.out.println("Withdrawing from Current account");
    }

}
public class W9Q5 {
    public static void main(String[] args) {
        savings s = new savings("Hammad", "Aligarh");
        current c = new current("Javed", "Delhi");

        s.display();
        s.deposit();
        s.withdraw();
        
        c.display();
        c.deposit();
        c.withdraw();
    }

    
}