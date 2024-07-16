import java.util.Scanner;

public class sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int J = sc.nextInt();
        int sum = 0;
        int temp = J;
    while(J>0){
        int remer = J%10;
        sum = sum*10+remer;
        J=J/10;

    }
    if(temp==sum){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not a Palindrome");
    }
    sc.close();
    }
    
}
