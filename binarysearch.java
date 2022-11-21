class abc
{
public static void main(String[] args)
{
int [] a={1,2,3,4,5,6,7,8};
int serch=9;
int li=0;
int hi=a.length-1;


while(li<=hi)
{
if(a[mi]==serch)
{
System.out.println("element is at"+mi+"position");
break;
}
else if(a[mi]<serch)
{=
li=mi+1;
}
else{
hi=mi-1;
}
mi=(li+hi)/2;
}
if(li>hi)
{
	System.out.println("element not found");
}
}
}
