import java.util.ArrayList;

public class findAllIndices {

    static ArrayList<Integer> allIndices(int[] arr , int n ,  int target , int idx){

        //base case
        if(idx >= n) return new ArrayList<Integer>();
        ArrayList<Integer> ans= new ArrayList<>();

        //self work
        if(arr[idx] == target){
            ans.add( idx);
        }
        //Recursive case
        ArrayList <Integer> smallAns= allIndices(arr, n, target, idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1 , 2,4, 5,6,4,3,2,1};
        int target=4;
        int n= arr.length;

        ArrayList<Integer> ans= allIndices(arr ,n, target , 0);

        for(Integer i: ans){
            System.out.println(i);
        }
    }
}
