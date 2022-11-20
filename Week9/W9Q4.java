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
