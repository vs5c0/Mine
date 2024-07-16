import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int N = sc.nextInt();
        String temp = " "+N;
        StringBuffer Se = new StringBuffer(temp);
        StringBuffer sm = Se.reverse();
        System.out.println(sm.toString());
        sc.close();
    }
}
