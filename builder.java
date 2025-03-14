public class builder {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("Heello");
        StringBuilder str1 = new StringBuilder(100);
        System.out.println(str1);
        str.append( "World");
        System.out.println(str);

        str.setCharAt(0, 'm');
        System.out.println(str);

        str.insert(2, 'y');
        System.out.println(str);

        str.deleteCharAt(0);
        System.out.println(str);

        str.reverse();
        System.out.println(str);
        str.delete(1, 2);  //0 to 1 will delete =>  2-1=1
        System.out.println(str);
    }
}
