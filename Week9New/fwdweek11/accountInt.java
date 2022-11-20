interface account {
    void deposit();

    void withdraw();

    static void aboutBank() {
        System.out.println("Informtion About the bank");
    }
    default void takeLoan(){}
}
