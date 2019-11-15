import java.util.Scanner;
import java.util.Stack;

public class StackBalance
{
	public static String check(String st)
	{
	String a;
		char arr[]=st.toCharArray();
		Stack<Character> s=new Stack();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='('||arr[i]=='{'||arr[i]=='[')
			{
				s.push(arr[i]);
				
			}
			
			else if(arr[i]==')'&&s.peek()=='('||arr[i]=='}'&&s.peek()=='{'||arr[i]==']'&&s.peek()=='[')
			{
				s.pop();
			}
			
			}
		if(s.empty())
			a="Balanced";
		else
			a="Unbalanced";
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		String a;
		a=check(st);
		System.out.println(a);

	}

}