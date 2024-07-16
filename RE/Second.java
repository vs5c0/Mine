public class Second {
    public int add(int x,int y){
        return(x+y);
    }
    public static void main(String[] args) {
        Second obj = new Second();
        int b =obj.add(23, 34);
        System.out.println(b);
        
    }
}
