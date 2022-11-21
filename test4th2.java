

///// //// stack - push,pop,index,isempty,iterator method question 7 answer

class stest
{
public static void main(String []args)
{
Stack<String>s=new Stack<String>();
s.push("shubham");
s.push("sambhaji");
s.push("shivaji");
System.out.println("list is "+s);
System.out.println("s is  "+s.empty());
s.pop();
System.out.println("new list is "+s);
int loc =s.search("sambhaji");
System.out.println("location of sambhaji "+loc);
Iterator itr=s.iterator();
	while (itr.hasNext())
	{
	System.out.println(itr.next());
	}

}
}