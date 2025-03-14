import java.util.Scanner;

class algebra {
    int a=10;
    int b=5;

   // int add(){
   //     int ans= a+b;
   // return ans;
   // }                            //class-level-method
    //int sub(){
    //    return a-b;
   // }
     
    int add(){
        int p=100;
        int q= 20;
        return p+q;

    }
    int sub(){
        int p=300;
        int q=89;
        return p-q;
    }
}  //Q) add two numbers by using methods
public class algebraaaaaa{
    public static void main(String[] args){
        algebra obj= new algebra();
        Scanner sc= new Scanner( System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Sum is");
        int ans= obj.add(x, y);   //call method
        System.out.println(ans);
    }
}
