class bookthseat
{
static int total_seat=20;
 synchronized static void bookseat(int seats)
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
class mythread1 extends Thread
{
bookthseat b;int seats;
mythread1(bookthseat b,int seats)
{
this.b=b;
this.seats=seats;
}
public void run()
{
b.bookseat(seats);
}
}

class mythread2 extends Thread
{
bookthseat b;int seats;
mythread2(bookthseat b,int seats)
{
this.b=b;
this.seats=seats;
}
public void run()
{
b.bookseat(seats);
}
}

class abc
{
public static void main(String[]args)
{
 bookthseat b1=new bookthseat();

mythread1 t1=new mythread1(b1,7);
t1.start();
mythread2 t2=new mythread2(b1,5);
t2.start();

bookthseat b2=new bookthseat();

mythread1 t3=new mythread1(b2,5);
t3.start();
mythread2 t4=new mythread2(b2,9);
t4.start();
}
}