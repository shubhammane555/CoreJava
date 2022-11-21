import java.util.*;
class stest
{
public static void main(String []args)
{
Stack<String>om=new Stack<String>();
om.push("saloni");
om.push("aarati");
om.push("khushi");
System.out.println("list is "+om);
System.out.println("om is single "+om.empty());
om.pop();//it will remove last data
System.out.println("new list is "+om);
System.out.println("peek element is "+om.peek()); ///it will show last  element
om.push("shakti");
om.push("bhakti");
System.out.println("new list is "+om);
int loc =om.search("aarati");
System.out.println("location of aarati "+loc);
Iterator itr=om.iterator();
	while (itr.hasNext())
	{
	System.out.println(itr.next());
	}

}
}