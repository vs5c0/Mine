import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int O = sc.nextInt();
        System.out.println("Enter another Number: ");
        int OO = sc.nextInt();
        System.out.println("Before Swapping: " +O);
        System.out.println("Before Swapping: " +OO);
        int temp = O;
        O=OO;
        OO=temp;
        System.out.println("After Swapping: " +O);
        System.out.println("After Swapping: " +OO);
        sc.close();
    }
}
