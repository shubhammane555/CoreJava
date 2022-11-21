class bookthseat
{
int total_seat=10;
synchronized void bookseat(int seats)
{
if(total_seat>=seats)
{
System.out.println(seats+"book succsfully");
total_seat=total_seat-seats;
System.out.println("seat left"+total_seat);
}
else
{
System.out.println("soory  seat cannot book ");
System.out.println("seat left"+total_seat);
}
}
}
 class moviebook extends Thread
{
static bookthapp b;
int seats;
public void run()
{
b.bookseat(seats);
}
public static void main(String[]args)
{
b=new bookthapp();

moviebook deepak=new moviebook();
deepak.seats=7;
deepak.start();

moviebook shubham=new moviebook();
shubham.seats=6;
shubham.start();
}
}