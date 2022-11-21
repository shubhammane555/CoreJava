import java.util.*;
class stest
{
public static void main(String []args)
{
PriorityQueue<String>r=new PriorityQueue<String>();
r.add("rushi");
r.add("prachi");
r.add("shivaji");
System.out.println("list in queue"+r);
System.out.println("first element in queue"+r.element());
System.out.println("top element in queue"+r.peek());
r.offer("abc");
System.out.println("list "+r);
r.remove("abc");
System.out.println("list "+r);
r.poll();
System.out.println("list "+r);
}
}
