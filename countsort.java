public class countsort {

    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.println(val + " ");
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

        //find largest ele of arr
        int max= findMax(arr);

        //freq arr=> count
        int[] count= new int[max+1];
        for(int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0; i< count.length; i++){
            for(int j=0; j< count[i]; j++){
                arr[k++]=i;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr= {4 , 3, 1, 5, 3, 1, 3, 5};
        basicCountSort(arr);
        displayArr(arr);
    }
}
