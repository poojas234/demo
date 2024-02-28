package string;
import java.util.*;

public class reverse {

	public static void main(String[] args) {
	String s="hello world!";
	char[] a= s.toCharArray();
	int l=s.length();
	for (int i=0;i<=l/2-1;i++)
	{
		char temp= a[i];
       a[i]=a[l-i-1];
       a[l-i-1]=temp;
	}
	System.out.println(a);
	}

}
