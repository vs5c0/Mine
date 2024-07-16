public class Ev {
    public static void main(String[] args) {
        int a[] = {12,4,1,24,55,124,5514,10 };
        int A = a.length;
        System.out.println("Even Numbers in Array");
        for(int i=0;i<A;i++){
            if(a[i]%2==0){
                System.out.println("Even Numbers: " +a[i]);
            }
        }
        System.out.println("Odd Numbers in Array ");
        for(int i=0;i<A;i++){
            if(a[i]%2!=0){
                System.out.println("Odd Numbers: " +a[i]);
            }
        }
    }
}
