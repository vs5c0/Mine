public class Tra {
    public static void main(String[] args) {
        int i, alpha=65;
        for(i=0;i<8;i++){
         
        
        for(int j=8;j>i;j--){
            System.out.print(" ");
        }
        for(int k =0;k<=i;k++){
            System.out.print((char)(alpha+k)+ " ");
        }
        System.out.println();
    }
}
}