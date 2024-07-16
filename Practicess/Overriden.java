public class Overriden {
    void run(){
        System.out.println("Running");
    }
}
class Rem extends Overriden{
    void run(){
        System.out.println("Biking");
    }

    public static void main(String[] args) {
        Rem ob = new Rem();
        ob.run();
    }
    
}
