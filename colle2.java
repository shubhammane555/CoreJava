import java.util.*;
class atest
{
public static void main(String []args)
{
ArrayList<String>om=new ArrayList<String>();
om.add("aishu");
om.add("apurva");
om.add("vidula");
System.out.println("omkar chi list"+om);
ArrayList<String>p=new ArrayList<String>();
p.add("swara");
p.add("priyanka");
p.add("dipti");
System.out.println("prasad chi list"+p);
om.addAll(p);
System.out.println("after adding both list"+om);
System.out.println("total size of list"+om.size());
}
}
