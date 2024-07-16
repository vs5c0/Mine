public class fouthern {
    public static void main(String[] args) {
        int ar[] = {34,5,1,344,133,65};
        int W = ar.length;
        for(int i=0;i<W;i++){
            if(ar[i]%2==0){
                System.out.println("Even Numbers: "+ar[i]);
            }
        }
        for(int i=0;i<W;i++){
            if(ar[i]%2!=0){
                System.out.println("Odd Numbers: "+ar[i]);
            }
        }
    }
    
}
