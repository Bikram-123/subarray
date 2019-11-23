import java.util.Scanner;

public class MaxElement {

	public static int MaxEle(int arr[],int k)
	{
		int m=0;
		int a=0;
		int arr1[]=new int[1000000];
		for(int i=0;i<arr.length;i++)
		{
			int max=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
					arr1[a]=max;
					a++;
					
				}
			}}
			for(int i=0;i<a;i++)
			{
				if(arr1[i]>k)
					m++;
			}
		
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int max=MaxEle(arr,k);
		System.out.println(max);

	}

}