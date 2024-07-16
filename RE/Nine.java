import java.util.Scanner;
import java.util.Arrays;
public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine();
    
        System.out.println("Enter a String: ");
        String b = sc.nextLine();

        char[] c= a.toCharArray();
        char[] d = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
        sc.close();

    
    }
}
