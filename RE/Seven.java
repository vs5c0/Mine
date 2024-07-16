import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int M = sc.nextInt();
        int count =0;
        if(M<=1){
            System.out.println("Not a Prime ");
        }
        for(int i=2;i<=M/2;i++){
            if(count%i==0){
                count++;
            }
        }
        if (count>1) {
            System.out.println("Not a Prime");
            
        }else{
            System.out.println("Prime");
        }
        sc.close();
    }
}
