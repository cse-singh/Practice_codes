import java.util.*;
public class I18NTest 
{
public static void main(String s[]) throws Exception 
	{
		Locale l=null;
		if (s.length==3)
		l=new Locale(s[0],s[1],s[2]);
		else if (s.length==2)
		l=new Locale(s[0],s[1]);
		else
		l=new Locale(s[0]);
ResourceBundle
		rb=ResourceBundle.getBundle 
("ApplicationResources",l);
		System.out.println(rb.getString("welcome.message"));
 }//end main
}//end class
