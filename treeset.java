import java.util.*;
class stest
{
public static void main(String []args)
{
TreeSet<String>om=new TreeSet<String>();
om.add("A");
om.add("B");
om.add("C");
om.add("D");
om.add("E");
System.out.println("lis is "+om);
Iterator i=om.descendingIterator();
while (i.hasNext())
{
System.out.println(i.next());
}

om.pollFirst();
System.out.println("after pollFirst  is "+om);
om.pollLast();
System.out.println("after pollLast  is "+om);
}
}

