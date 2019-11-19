import java.util.Scanner;

public class Linkedlist2 {
	static	Node  head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static Linkedlist2 insert(int a,Linkedlist2 li)
	{
		Node n=new Node(a);
		if(li.head==null)
		{
			li.head=n;
		}
		else
		{
		Node last=li.head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=n;
		}
		return li;
	}
public static Linkedlist2 display(Linkedlist2 li)
{
	Node last=li.head;
	if(li.head==null)
	{
		System.out.println("No list exists");
	}
	while(last.next!=null)
	{
		System.out.println(last.data);
		last=last.next;
	}
	System.out.println(last.data);
	return li;
}
public static Linkedlist2 rotate(Linkedlist2 li,int k)
{
	if(li.head==null)
	{
		System.out.println("No such List exists");
	}
	else
	{
		while(k>0)
		{
			Node last=li.head;
			Node s=null;
			while(last.next!=null)
			{
			    s=last;
				last=last.next;
			}
			s.next=null;
			last.next=li.head;
			li.head=last;
			k--;
		}
	}
	return li;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    Linkedlist2 li=new Linkedlist2();
	  for(int i=0;i<n;i++)
	  {
		  int a=sc.nextInt();
		  insert(a,li);
	  }
	  int k=sc.nextInt();
	  rotate(li,k);
	  display(li);
	}

}