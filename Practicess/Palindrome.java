import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int P = sc.nextInt();
        int rem=0,sum=0;
        int temp=P;
        while (P>0) {
            rem=rem%10;
            sum=sum*10+rem;
            P=P/10;
            
        }
        if(P==sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();

    }
}
