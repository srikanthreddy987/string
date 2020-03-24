package StringCom.Maven.String;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
    	String s=new String();
        s=sc.nextLine();
        char[] ch=s.toCharArray();
        if(ch[0]=='A')
        {
        	ch[0]='@';
        }
        if(ch[1]=='A')
        {
        	ch[1]='@';
        }
    	for(int k=0;k<s.length();k++)
    	{
    		if(ch[k]!='@')
    		{
    			System.out.print(ch[k]);
    		}
    	}
    }
}
