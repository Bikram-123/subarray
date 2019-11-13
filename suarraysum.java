import java.util.Scanner;

public class Subarraysum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int input=sc.nextInt();  //given integer
		for(int i=0;i<n-1;i++)
		{
		int  sum=arr[i];
		    for(int j=i+1;j<n;j++)
		    {
			sum=sum+arr[j];
			if(sum==input)
				System.out.println("starting index "+i+"ending index "+j);
		     }

		}
	}

}
