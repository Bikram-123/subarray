import java.util.Scanner;
import java.util.Stack;

public class Prepost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
Stack<String> st=new Stack();
for (int i=s.length()-1;i>=0;i--)
{
	if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
	{
		String a=st.peek();
		st.pop();
		String b=st.peek();
		st.pop();
		String c=a+b+s.charAt(i);
		st.push(c);
	}
	else
	{
		st.push(s.charAt(i)+"");
	}
}
for(int i=0;i<st.size();i++)
{
	System.out.println(st.pop());
}

	}

}
