import java.util.*;
class abc
{
public static void main(String[]args)
{
ArrayList<String>ram=new ArrayList<String>();
ram.add("xxx");
ram.add("yyy");
ram.add("zzz");
System.out.println("list is "+ram);
ArrayList<String>jam=new ArrayList<String>();
jam.add("aaa");
jam.add("bbb");
jam.add("ccc");
System.out.println("list is "+jam);
System.out.println("list is "+ram.size());
System.out.println("list is "+ram.isEmpty());
ram.add(1,"hhh");
System.out.println("list is "+ram);
ram.addAll(jam);
System.out.println("list is "+ram);
jam.remove("aaa");
System.out.println("list is "+jam);
ram.removeAll(jam);
ram.clear();
System.out.println("list is "+ram);
}
}
