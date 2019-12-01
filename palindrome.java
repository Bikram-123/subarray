import java.util.Scanner;
public class palindrome
{
	static node head;
static class node
{
	node next;
	int data;
	node(int d)
	{
		data=d;
		next=null;
	}
}
public static palindrome insert(palindrome l1,int a)
{
	node n1=new node(a);
	if(l1.head==null)
	{
		l1.head=n1;
	}
	else
	{
		node temp=l1.head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n1;
	}
	return l1;
}
public static void check(palindrome l1)
{
	int sum=0;
	int sum1=0;
	int place=1;
	node temp=l1.head;
	while(temp!=null)
	{
		sum=sum*10+temp.data;
		sum1=sum1+place*temp.data;
		place=place*10;
		temp=temp.next;
	}
	if(sum==sum1)
	{
		System.out.println("YES IT IS PALINDROME");
	}
	else
	{
		System.out.println("NO IT IS NOT PALINDROME");
	}
}
public static void main(String arg[])
{
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	palindrome l1=new palindrome();
	for(int i=0;i<size;i++)
	{
		int a=in.nextInt();
		insert(l1,a);
	}
	check(l1);
}
}