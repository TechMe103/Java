public class binarySearch {

    static boolean Binary_search(int[] arr , int target){

        int n= arr.length;
        int st=0; int end= n-1;

        while(st <= end){

            int mid= st+(end - st)/2;
            if(target == arr[mid]){
                return true;
            }
            else if(target < arr[mid]){
                end= mid-1;
            }else{
                st= mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {2 , 4, 8, 20, 24, 45, 67, 89};
        int target=8;
        System.out.println(Binary_search(arr , target));
    }
}
