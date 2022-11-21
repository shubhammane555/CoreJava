class abc
{
public static void main(String[]args)
{
StringBuffer s=new StringBuffer("i am fine");
System.out.println("whole word is "+s);
s.append("ok");
System.out.println("whole word is "+s);
s.delete(2,4);
System.out.println("whole word is "+s);
s.insert(2,"ok");
s.reverse();
System.out.println("whole word is "+s);
}
}
