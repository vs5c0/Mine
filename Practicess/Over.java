public class Over {
    public int add(int x,int y){
        return (x+y);
    }
    public int add(int x,int y,int z){
        return(x+y+z);
    }
    public static void main(String[] args) {
        Over obj = new Over();
    System.out.println("Addition :" +obj.add(12, 23));
    }
    
}
