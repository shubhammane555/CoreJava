import java.util.*;
class stest
{
public static void main(String []args)
{
 LinkedHashMap<Integer,String>n=new LinkedHashMap<Integer,String>();
 n.put(1,"mohan");
 n.put(5,"ramesh");
 n.put(4,"pandya");
 n.put(3,"saby");
 System.out.println("element in map"+n);
 System.out.println(n.keySet());
  System.out.println(n.values());
   System.out.println(n.entrySet());
    LinkedHashMap<Integer,String>s=new LinkedHashMap<Integer,String>();
  s.putAll(n);
   System.out.println("element in map"+s);
   System.out.println("element in map"+s.isEmpty());
   System.out.println("element in map"+s.size());
   s.clear();
    System.out.println("element in map"+s);
	n.remove(1,"mohan");
	 System.out.println("element in map"+n);
	
	 
	 System.out.println(" 2 no che key ahe ka"+n.containsKey(2));
	  System.out.println("is it contain mohan "+n.containsValue("mohan"));
	 
	  n.putIfAbsent(2,"abc");
	 System.out.println("element in map"+n);
	  n.replaceAll((k,v)->"saby");
	  System.out.println("element in map"+n);
	  n.replace(2,"baby");
	    System.out.println("element in map"+n);
	  
}
}