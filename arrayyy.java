class ArraysExample{

    void demoArrays(){

        int[] ages={ 21, 32, 34,54, 67};

        //for loop
        for(int i=0; i< ages.length ; i++){
            System.out.println(ages[i]);
        }

        //for each loop
        for(int age : ages){
            System.out.println(age);
        }

        //while loop
        int i=0;
        while ( i < ages.length) {
            System.out.println(ages[i]);
            i++;
        }
    }
    void multiArray(){

        int[][] arr={{1 , 2, 3} , {4, 5, 6} , {7, 8, 9}};

        for(int i=0 ; i< arr.length ; i++){
            for(int j=0; j<= arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}

public class arrayyy {
    public static void main(String[] args) {
        ArraysExample obj= new ArraysExample();
        obj.demoArrays();
        ArraysExample obj1= new ArraysExample();
        obj1.multiArray();
    }
}
