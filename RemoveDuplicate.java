import java.io.*;
import java.util.*;
public class Removeduplicate {
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	char x=' ';
	TreeSet<Character> set=new TreeSet<Character>();
	for(int i=0;i<s.length()-1;i++)
	{
		x=s.charAt(i);
		set.add(x);
	}
	System.out.println(set);
}
}
