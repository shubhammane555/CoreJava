class abc
{
public static void main(String []args)
{

StringBuffer s=new StringBuffer("omkar");
s.append("like someone");
s.replace(5,10,"hate");
s.delete(5,9);

System.out.println(s);
s.insert(5,"weds");

System.out.println(s);
s.reverse();
System.out.println(s);

}
}
