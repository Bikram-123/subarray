import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=str.toCharArray();
		int len=arr.length;
		int j=len-1;
		for(int i=0;i<j;i++)
		{
			if((arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z')&&(arr[j]>='a'&&arr[j]<='z'||arr[j]>='A'&&arr[j]<='Z'))
			{
				char a=arr[i];
				arr[i]=arr[j];
				arr[j]=a;
				j--;
			}
			else if(arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z')
			{
				if((arr[j]>='a'&&arr[j]<='z'||arr[j]>='A'&&arr[j]<='Z'))
				{

				}
				else
				{
					i=i-1;
					j--;
				}
			}
			else if(arr[j]>='a'&&arr[j]<='z'||arr[j]>='A'&&arr[j]<='Z')
			{
				if(arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z')
				{

				}
				else
				{

				}
			}
			else
				j--;
		}
		String st=new String(arr);
		System.out.println(st);
}

}
