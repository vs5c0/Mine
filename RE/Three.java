class Three
{
    void run(){
        System.out.println("Bike");
    }
}
class B extends Three{
    void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
        B on = new B();
        on.run();
    }
}