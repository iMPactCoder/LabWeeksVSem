public class BuySomething implements Bike,Scooty {
    public void details(){
        Bike.super.details();
        Scooty.super.details();
    }
    public void offer(){
        System.out.println("Upcoming offers wil be diaplayed here");
    }
}
