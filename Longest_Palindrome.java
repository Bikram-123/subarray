import java.util.Scanner;

/*Given a string, find the longest substring which is palindrome. For example, if the given string is “forgeeksskeegfor”, 
the output should be “geeksskeeg”.*/


public class LongestPalindrome {
	public static String Lpalindrome(String st)
	{
		
	String str1=st.substring(0,1);
	int k=str1.length();
		for(int i=0;i<st.length();i++)
		{
			for(int j=i+1;j<st.length();j++)
			{
				String str=st.substring(i,j);
				String s="";
				for(int z=str.length()-1;z>=0;z--)
				{
					s=s+str.charAt(z);
				}
				if(k<s.length()&&s.equals(str))
				{
					str1=s;
					k=s.length();
				}
			}
		}
		return str1;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		String s;
		s=Lpalindrome(str);
		System.out.println(s);
		// TODO Auto-generated method stub

	}

}
