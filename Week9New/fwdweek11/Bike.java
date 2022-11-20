public interface Bike {
    void offer();
    default void details(){
        System.out.println("Details of Bike");
    }
}