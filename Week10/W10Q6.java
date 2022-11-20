class University{
    String uname;
    int ranking;
    University(String uname,int r){
        this.uname = uname;
        ranking = r;
    }
}
class faculty extends University{
    private String fname;
    faculty(String fname,String uname,int r){
        super(uname, r);
        this.fname = fname;
    }
    void details(){
        System.out.println("Name of University is "+uname+" with ranking "+ranking);
        System.out.println("Name of faculty : "+ fname);
    }

}
class department extends faculty{
    private String dname;
    private String chairman;
    department(String dname,String chairman,String fname,String uname,int r){
        super(fname,uname,r);
        this.dname = dname;
        this.chairman = chairman;

    }

    void display(){
        super.details();
        this.details();
    }
    void details(){
        System.out.println("name of department : "+dname);
        System.out.println("name of chairman : "+chairman);
        
    }

}



public class W10Q6 {
    public static void main(String[] args) {
        department d1  = new department("Computer Science","Prof. Aasim Zafar","Science","AMU",1);
        d1.display();
        
    }
}

