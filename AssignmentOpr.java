public class AssignmentOpr {
    public static void main(String[]  args){
        int p=10 , q;
        q=p;
        System.out.println(q);
        p+=q;                       //p+=q  => p=10+(q==10)= 20;
        
        System.out.println(p);
        p-=q;
        System.out.println(p);

    }
}
