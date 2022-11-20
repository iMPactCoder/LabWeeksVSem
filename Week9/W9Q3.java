class account{
    private int id=0;
    private String Account_holder_name;
    private String address;
    private int balance=0;

    account(String name,String add){
        id = id+1;
        Account_holder_name = name;
        address=add;
    }
    

    void deposit(int amount){
        balance+=amount;
        System.out.println("Now, balance is "+ balance);
    }
    void withdraw(int amount){
        balance -= amount; 
        System.out.println("Now, balance is "+ balance);
    }
    void display(){
        System.out.println("Name :"+Account_holder_name);
        System.out.println("Address :"+ address);
    }

    static void simple(int amount,double rate,double time){
        System.out.println("Final amount : "+(amount+(amount*rate*time)/100));
    }
    static void compound(int amount,double rate,double time){
        System.out.println("Final amount : "+(amount*(Math.pow(1+rate/100,time))));
    }
}

public class W9Q3 {
    public static void main(String[] args) {
        account a = new account("Hammad","Aligarh");
        a.deposit(1000);
        a.withdraw(500);

        account.simple(2000,3,2);
        account.compound(5000, 5, 2);

        
    }

}
