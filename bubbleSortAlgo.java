public class bubbleSortAlgo {

    static void bubbleSort(int[] arr){
        int n=arr.length;

        for(int i=0; i< n-1; i++){
            for(int j=0; j< n-1; j++){
                //last ele already at sorted position
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {7 , 6, 5, 4,3};
        bubbleSort(arr);
        for(int i: arr){
            System.out.println(i+" ");
        }
    }
}
