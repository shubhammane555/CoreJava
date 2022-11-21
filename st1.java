class st1
{
public static void main(String []args)
{
String abhi="jupitor";
String pruthvi="jupitor";
String suraj =new String("jupitor");
String omkar="splender";
System.out.println(abhi.equals(pruthvi));
System.out.println(abhi.equals(suraj));
System.out.println(abhi.equals(omkar));

System.out.println(abhi==pruthvi);
System.out.println(abhi==suraj);
System.out.println(abhi==omkar);
System.out.println(abhi.compareTo(pruthvi));
System.out.println(abhi.compareTo(suraj));
System.out.println(abhi.compareTo(omkar));
System.out.println(abhi.equalsIgnoreCase(pruthvi));
}
}
