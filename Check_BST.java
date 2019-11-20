package practice;

public class CheckBST {
	Node root;
	static int i;
	static int j;
	static int arr[]=new int[1000];
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	public static int Count(Node r)
	{
		
		if(r==null)
			return 0;
		else
		{
		Count(r.left);
		i++;
		Count(r.right);
		}
		return i;
	}
	public static Node inorder(Node r)
	{
		if(r==null)
		{
			
		}
		else {
			
		inorder(r.left);
		if(j<i)
		{
			arr[j]=r.data;
			j++;
		}
		inorder(r.right);
	}
	return r;
	}
	public static void Bst(Node r)
	{
		
		int s=Count(r);
		r=inorder(r);
		int flag=0;
		for(int i=1;i<s;i++)
		{
			if(arr[i]>arr[i-1])
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
			}
			if(flag==1)
			{
				System.out.println("The given tree is a BST");
			}
			else {
				      System.out.println("The given tree is not a BST");
			}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckBST c=new CheckBST();
		c.root=new Node(50);
		c.root.left=new Node(30);
		c.root.right=new Node(70);
		c.root.left.left=new Node(20);
		c.root.left.right=new Node(40);
		c.root.right.left=new Node(60);
		c.root.right.right=new Node(80);
		Bst(c.root);
	}

}
