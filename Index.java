import java.util.*;
public class Index {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Integer n=sc.nextInt();
	Integer arr[]=new Integer[n];
	ArrayList<Integer>list= new ArrayList<Integer>();
	Integer x;
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		x=arr[i]-arr[i+1];
		list.add(Math.abs(x));
		}
		System.out.println(list.indexOf(Collections.max(list)));
}
}
