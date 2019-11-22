
import java.util.Scanner;

public class Maximum {

	public static void Max(int arr[],int w)
	{
		int a=arr.length;
		for(int i=0;i<=a-w;i++)
		{
			int max=-100;
			for(int j=i;j<i+w;j++)
			{
				if(arr[j]>max)
					max=arr[j];
			}
			System.out.print(max+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Max(arr,w);
	}

}
