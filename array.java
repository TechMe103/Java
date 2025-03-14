class ArraysExample{

    void demoArrays(){
        int[] ages= new int[3];
        float[] weights= new float[3];
        String[] name= {"Sanika" , "Sakshi" , "Snehal"};

        ages[0]=11;
        ages[1]=12;
        ages[2]=13;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(name.length);

        weights[0]=44;
        weights[1]=45;
        weights[2]=78;

        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

        
        System.out.println(name);


    }
}

public class array {
    public static void main(String[] args){
        ArraysExample obj= new ArraysExample();
        obj.demoArrays();
    }
    
}
