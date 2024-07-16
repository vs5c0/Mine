import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter another String: ");
        String ss = sc.nextLine();
        char[] c = s.toCharArray();
        char[] d = ss.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);

        if(Arrays.equals(c,d)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not a Anagram");
        }
        sc.close();
    }
    
}
