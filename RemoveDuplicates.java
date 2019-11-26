import java.util.Scanner;

public class StringAdjacent {


		public static String remove(String str)
		{
			if(str.length()<=1)
				return str;
			if(str.charAt(0)==str.charAt(1))
			{ 
				int i;
				for(i=0;i<str.length()-1;i++)
				{
					if(str.charAt(i)==str.charAt(i+1))
						continue;
					else
						break;
				}
				return remove(str.substring(i+1));
			}
			else
				return str.charAt(0)+remove(str.substring(1));
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String str1=remove(str);
	System.out.println(str1);
		}

}