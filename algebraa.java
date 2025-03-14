import java.util.Scanner;
      
class algebra {

    algebra(){
        System.out.println("Constructor called");
    }
    int add(int a , int b){
        int ans= a+b;
        return ans;
    }
        
}  //Q) add two numbers by using methods
public class algebraa{
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
