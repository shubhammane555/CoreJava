import java.util.*;
class stest
{
public static void main(String []args)
{
 Hashtable<Integer,String>n=new Hashtable<Integer,String>();
 n.put(101,"shubham");
 n.put(102,"venkatesh");
 n.put(103,"rahul");
 n.put(104,"suraj");

System.out.println("element in map"+n);
System.out.println("list is "+n.getOrDefault(105,"not found"));
n.putIfAbsent(105,"tatya");
System.out.println("element in map"+n);
}
}

