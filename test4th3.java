
///// ////array list 7 method question 6 answer

import java.util.*;
class abc
{
public static void main(String []args)
{
ArrayList<String>s=new ArrayList<String>();
s.add("shubham");
s.add("sambhaji");
s.add("shivaji");
System.out.println("list 1 is "+s);
ArrayList<String>m=new ArrayList<String>();
m.add("sahaji");
m.add("rajaram");
System.out.println("list 1 is "+m);
s.addAll(m);
System.out.println("list 1 is "+s);
s.removeAll(m);
System.out.println("list 1 is "+s);
s.remove("shubham");
System.out.println("list 1 is "+s);
System.out.println("list 1 is "+s.size());
System.out.println("list 1 is "+s.isEmpty());
System.out.println("list 1 is "+s.get(1));
s.clear();
System.out.println("list 1 is "+s);
}
}
