import java.util.Scanner;

public class Linkedlist1 {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static Linkedlist1 insert(int d,Linkedlist1 li)
	{
		Node n=new Node(d);
		if(li.head==null)
		{
			li.head=n;
		}
		else {
		Node last=li.head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=n;
		}
		return li;
	}
public static Linkedlist1 duplicate(Linkedlist1 li)
{
	Node l=li.head;
	while(l!=null)
	{
		int a=l.data;
		Node ll=l.next;
		while(ll!=null)
		{
			if(a==ll.data)
			{
				l.next=ll.next;
				
			}
			
			ll=ll.next;
			
		}
		
		l=l.next;	
	}
	return li;
}
public static Linkedlist1 display(Linkedlist1 li)
{
	Node l=li.head;
	while(l.next!=null)
	{
	
		System.out.println(l.data);
		l=l.next;
	}
	
	System.out.println(l.data);
	
	return li;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Linkedlist1 li=new Linkedlist1();
int n=sc.nextInt();

for(int i=0;i<n;i++)
{
	int d=sc.nextInt();
	insert(d, li);
	
}
duplicate(li);
display(li);

	}

}