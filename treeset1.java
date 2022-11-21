import java.util.*;
class stest
{
public static void main(String []args)
{
TreeSet<Integer>R=new TreeSet<Integer>();
R.add(5);
R.add(2);
R.add(12);
R.add(7);
R.add(8);
R.add(3);
System.out.println("list is "+R);
System.out.println("ceiling no of 6 "+R.ceiling(6));//upper side value
System.out.println("ceiling no of 8 "+R.ceiling(8));
System.out.println("floor no of 10 "+R.floor(10));//lower side value
System.out.println("floor no of 5 "+R.floor(5));
}
}
