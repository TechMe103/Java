class ArraysExample{

    void multiArray(){

       // int[][] arr1= new int[3][2];         //for 2- D
       int[][] arr2={{1,2} , {3, 4} , {5, 6} , {7, 8}};

        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);
        System.out.println(arr2[2][1]);
    }
}

public class arrayy {
    public static void main(String[] args){
        ArraysExample obj= new ArraysExample();
        obj.multiArray();
    }
    
}
//for 3D
// int[][] arr3= new int[4][3][2];
//arr3[0][0][0];