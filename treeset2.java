import java.util.*;
class stest
{
public static void main(String []args)
{
TreeSet<String>T=new TreeSet<String>();
T.add("saba");
T.add("manasi");
T.add("vasu");
T.add("pranali");
for(String s:T)
{
System.out.println(s);
}
Iterator itr=T.descendingIterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}

}
}

