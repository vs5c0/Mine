import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int m = sc.nextInt();
        System.out.println("Enter another Number: ");
        int n =sc.nextInt();
        System.out.println("Before Swap: " +m);
        System.out.println("Before Swap: " +n);

        int temp = m;
        m=n;
        n=temp;
        System.out.println("After Swap: " +m);
        System.out.println("After Swap:" +n);

    }
    
}
