import java.util.*;
public class Chocolateprob {

	
		static int []arr;
		static int search(int[] arr,int m)
		{
			if(arr.length==0||m==0)
			{
				return 0;
			}
			Arrays.sort(arr);
			if(arr.length<m)
			{
				return -1;
			}
			int min=Integer.MAX_VALUE;
			int a1=0;
			int s=0;
			for(int i=0;i+m-1<arr.length;i++)
			{
				int diff=arr[i+m-1]-arr[i];
				if(diff<min)
				{
					min=diff;
					a1=i;
					s=i+m-1;
				}
			}
			return arr[s]-arr[a1];
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			arr=new int[size];
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			int m=sc.nextInt();
			int k=search(arr,m);
			System.out.println(k);
		}

	}