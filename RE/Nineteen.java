import java.util.Scanner;

class Nineteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int EW = sc.nextInt();
        if (isArmstrong(EW)) {
            System.out.println("Armstrong");
            
        }else{
            System.out.println("Not an Armstrong");
        }}
        public static boolean isArmstrong(int EW){
            int original  =EW;
            int sum =0;
            
            while(EW!=0){
                int digit = EW%10;
                sum=sum+digit*digit*digit;
                EW=EW/10;

            }
return sum == original;
        
        } 
    
        
        
}