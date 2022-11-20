class ObjectOriented{
    void abstraction(){
        System.out.println("Abstraction");
    }
    void polymorphism(){
        System.out.println("Polymorphism");
    }
    void inheritance(){
        System.out.println("Inheritance");
    }
}
class JavaLanguage extends ObjectOriented{
    void persistence() {
        System.out.println("Persistance");
    }
    void  interfaces(){
        System.out.println("Interfaces");
    }
}

class C extends ObjectOriented{
    void template(){
        System.out.println("Template");
    }
    void friendFunction(){
        System.out.println("FriendFunction");
    }
}

public class W10Q5 {
    public static void main(String[] args) {
        
    
    C c1 = new C();
    c1.abstraction();
    c1.polymorphism();
    c1.inheritance();
    c1.template();
    c1.friendFunction();
    }


}
