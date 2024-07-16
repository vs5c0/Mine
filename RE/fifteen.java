public class fifteen {
    public static void main(String[] args) {
        int arrr[] = {12,23,1,4,111,231,4};
        int size = arrr.length;
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arrr[i]>arrr[j]){
                    temp = arrr[i];
                    arrr[i]=arrr[j];
                    arrr[j]=temp;
                }
            

            }
            System.out.println("Highest Element: " +arrr[size-1]);
        }
        
    }
    
}
