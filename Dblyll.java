import java.util.Scanner;

public class RevDbl {
	Node head;
	static class Node
	{
		
		Node prev=null;
		Node next=null;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
			prev=null;
		}
	}
	public static RevDbl insert(RevDbl li,int d)
	{
		Node n=new Node(d);
		Node last=li.head;
		if(li.head==null)
		{
			li.head=n;
		}
		else
		{
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n;
			n.prev=last;
		}
		return li;
	}
	public static RevDbl display(RevDbl li)
	{
		Node last=li.head;
		if(li.head==null)
		{
			System.out.println("No list is present");
		}
		else
		{
			while(last.next!=null)
			{
				System.out.println(last.data);
				last=last.next;
			}
			System.out.println(last.data);
			
		}
		return li;
	}
	public static RevDbl rev(RevDbl li)
	{
		Node curr=li.head;
		Node s=null;
		Node pre=null;
		while(curr!=null)
		{
			s=curr.next;
			curr.next=pre;
			pre=curr;
			curr=s;
		}
		li.head=pre;
		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   RevDbl li=new RevDbl();
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
	   int s=sc.nextInt();
	   insert(li,s);
   }
   rev(li);
   display(li);
	}

}
