import java.util.Scanner;

public class Revnum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int s = sc.nextInt();
    String temp = " " +s;
    StringBuffer sm = new StringBuffer(temp);
    StringBuffer sbm = sm.reverse();
    System.out.println(sbm.toString());
    sc.close();

   } 
}
