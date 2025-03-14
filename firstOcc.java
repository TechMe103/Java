public class firstOcc {

    static int firstOccc(int[] arr , int x){

        int n=arr.length;
        int st=0;
        int end=n-1;
        int fo=-1;

        while(st <= end){

            int mid= st+(end- st) /2;
            if(arr[mid] == x){
                fo=mid;
                end= mid-1;
            }else if( arr[mid] < x){
                end= mid-1;
            }else{
                st= mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int[] arr={2 , 5, 5, 3, 1, 2};
        int x=5;
        System.out.println(firstOccc(arr , x));
    }
}
