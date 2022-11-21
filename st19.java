class st19
{
public static void main(String []args)
{
String s1=new String ("welcome Shubham");
String s2="welcome Shubham";
String s3=s1.intern();
System.out.println(s1==s2);
System.out.println(s2==s3);

}
}