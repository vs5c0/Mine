import java.util.Scanner;
class First
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String S = sc.nextLine();
        StringBuffer EE = new StringBuffer(S);
        EE.reverse();
        System.out.println(EE);
        sc.close();
    }
}