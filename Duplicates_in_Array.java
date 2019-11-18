import java.util.Scanner;

public class DuplicatesInArray {
	public static int[] d(int arr[],int max)
	{ 
		int arr1[]=new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			arr1[arr[i]]++;
		}
		
		return arr1;
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
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>=max)
				max=arr[i];
		}
int arr1[]=d(arr,max);
for(int i=0;i<arr1.length;i++)
{
	if(arr1[i]>0)
	System.out.println(i+" "+arr1[i]);
}

	}

}