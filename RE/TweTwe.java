class TweTwe{
    public static void main(String[] args) {
        int i,j,k,row=8;
        for(i=0;i<=row-1;i++){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(k=0;k<=row-i-1;k++){
                System.out.print("* "+"");
            }
            System.out.println();
        }
    }
} 