public class countSortIsStable {

    static void displayArr(int[] arr){

        for(int val : arr){
            System.out.println( val + " ");

        }
        System.out.println();
    }
    static int findMax(int[] arr){

        int nx= Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i] > nx){
                nx= arr[i];
            }
        }
        return nx;
    }
    
    static void basicCountSort(int[] arr){

        //largest ele
        int max= findMax(arr);

        //freq arr
        int[] count= new int[max+1];
        for(int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0; i< count.length; i++){
            for(int j=0; j< count[i] ; j++){
                arr[k++]= i;
            }
        }
    }
        
    static void countsort(int[] arr){

        int n= arr.length;
        int[] output= new int[n];
        int max= findMax(arr);
        int[] count= new int[max+1];
        for(int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        //make prefix sum array of count array
        for(int i=1; i< count.length; i++){
            count[i]+= count[i-1];
        }
        //find index of each ele of original arry and put in o/p arry
        for(int i=n-1 ; i>=0; i--){
            int index= count[arr[i] - 1];
            output[index] = arr[i];
            count[arr[i]]--;
        }
        //copy all ele of o/p to arr
        for(int i=0; i<n ; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr= {2 , 3, 2, 4, 0 , 1 , 0, 4 ,1, 2 };
        basicCountSort(arr);
        //countsort(arr);
        displayArr(arr);
    }
}
