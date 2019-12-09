import java.util.Scanner;
public class Main
{
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public static Main insert(Main li,int k)
    {
        Node n=new Node(k);
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
    public static Main display(Main li)
    {
        if(li.head==null)
        {
            System.out.println("No list present");
        }
        else
        {
            Node last=li.head;
            while(last.next!=null)
            {
                System.out.println(last.data);
                last=last.next;
            }
            System.out.println(last.data);
        }
        return li;
    }
    public static Main mid(Main li,int m)
    {
        int count=0;
        Node n=new Node(m);
        Node last=li.head;
        while(last.next!=null)
        {
            count++;
            last=last.next;
        }

            int M=(count/2);
            Node l=li.head;
            Node d=l.next;
            int a=0;
            while(l.next!=null)
            {
                
                if(a==M)
                {
                    l.next=n;
                    n.next=d;
                    break;
                }
                else
                {
                    
                a++;
               // System.out.println(a);
                l=l.next;
                d=d.next;
                }
            }
            
        
        return li;
        
    }
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Main li=new Main();
     int n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
         int s=sc.nextInt();
         insert(li,s);
     }
    int m=sc.nextInt();
    mid(li,m);
    display(li);
	}
}