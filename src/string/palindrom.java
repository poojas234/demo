package string;
import java.util.*;

public class palindrom {

	public static void main(String[] args) {
		
String s="poo p ghhg,poop!";
//String x=s.replaceAll("[^a-zA-Z0-9]","");
char[] a= s.toCharArray();
int start=0;
//Boolean f=s.

int end=s.length()-1;
int flag=0;
while(start<end)	
{
	
	if(s.charAt(start)==s.charAt(end))
	{
	start++;
	end--;
	}
	else
	{
		flag=1;
		break;
	}
	}
		

	if(flag==0)
System.out.println("palindrom");
else
System.out.println("not palindrom");

	}

}
