import java.util.*;
class stest
{
public static void main(String []args)
{
 TreeMap<Integer,String>n=new TreeMap<Integer,String>();
 n.put(1,"cbskop");
 n.put(4,"satara");
 n.put(2,"karad");
 n.put(3,"umbras");
 n.put(6,"katraj");
 n.put(5,"shrirval");
 n.put(7,"swargate");
 n.put(8,"inoxmall");
System.out.println("element in map"+n);
System.out.println("element are in descending order in map"+n.descendingMap());
System.out.println("element in head map"+n.headMap(3));
System.out.println("element in tail map"+n.tailMap(3));
System.out.println("element in sub map"+n.subMap(3,true,7,false));



}
}