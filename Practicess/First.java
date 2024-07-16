import java.util.Scanner;

class First
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        StringBuffer B = new StringBuffer(s);
        B.reverse();
        System.out.println(B);
        sc.close();
    }
}