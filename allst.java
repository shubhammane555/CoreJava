class abc 
{
public static void main(String[]args)
{
String s1="i love you";
String s2="i hate you";
String x="I LOVE YOU"; 
String z=new String("i love you");
String y = "i know you       ";

String s3=s1.replace("i","u");
String s4=s2.replaceAll("i","u");
int s5=s1.indexOf("love");
int s6=s2.lastIndexOf("you");
String s7=String.join("***","abc","dcv","aaa");
char ch = s1.charAt(4);
String s8 =z.intern();

System.out.println(s1==z);
System.out.println(s1.equals(s2));
System.out.println(s1.compareTo(s2));
System.out.println(s1==s2);
System.out.println(s1.contains("apple"));
System.out.println(s1.startsWith("i"));
System.out.println(s1.endsWith("you"));
System.out.println(s1.toUpperCase());`
System.out.println(s1.toLowerCase());
System.out.println(s1.isEmpty());
System.out.println(s1.substring(2,7));
System.out.println(s1.equalsIgnoreCase(x));
System.out.println(y.trim()+ " yes yes ");

System.out.println(ch);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(s6);
System.out.println(s7);
System.out.println(s8);
}
}
