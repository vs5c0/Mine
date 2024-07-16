import java.util.Arrays;
class twenty
{
    static void bubblesort(int arr[]){
        int size = arr.length;
        for(int i =0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

    }
    
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}