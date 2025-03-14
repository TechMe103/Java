import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    public static void main(String[] args) {
        float[] a={ 0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketsort(a);
        for(float val : a ){
            System.out.println(val + " ");
        }
    }
    static void bucketsort(float[] arr){

        int n= arr.length;
        ArrayList<Float>[] buckets= new ArrayList[n];

        //create empty buckets
        for(int i=0; i< n ; i++){
            buckets[i] = new ArrayList<Float>();
        }
        //add ele into buckets
        for(int i=0; i< n; i++){
            int bucketIndex= (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }
        //sort each brackets individualy
        for(int i=0; i< buckets.length; i++){
            Collections.sort(buckets[i]);
        }
        //merge all buckets to get final sorted array
        int index=0;
        for(int i=0; i< buckets.length; i++){
            ArrayList<Float> currBuckets= buckets[i];
            for(int j=0; j< currBuckets.size(); j++){
                arr[index++] = currBuckets.get(j);
            }
        }
    }
}
