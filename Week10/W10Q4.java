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
public class W10Q4 {
public static void main(String[] args) {
    JavaLanguage j = new JavaLanguage();
    j.abstraction();
    j.polymorphism();
    j.inheritance();
    j.persistence();
    j.interfaces();
}
    
}