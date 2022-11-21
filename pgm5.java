import java.util.*;
class abc
{
public static void main(String[]args)
{
Vector<String>ram=new Vector<String>();
ram.add("xxx");
ram.add("yyy");
ram.add("zzz");
System.out.println("list is "+ram);
Vector<String>jam=new Vector<String>();
jam.add("aaa");
jam.add("bbb");
jam.add("ccc");
System.out.println("list is "+jam);
System.out.println("list is "+ram.size());
System.out.println("list is "+ram.isEmpty());
ram.addAll(jam);
System.out.println("list is "+ram);
ram.removeAll(jam);
System.out.println("list is "+ram);
ram.clear();
System.out.println("list is "+ram);
}
}