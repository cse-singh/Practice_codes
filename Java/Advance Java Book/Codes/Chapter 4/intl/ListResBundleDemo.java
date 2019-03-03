import java.util.*;
public class ListResBundleDemo {

	static public void main(String[] args) 	{
		ResourceBundle stats=null;
Locale supportedLocales=null;
		if (args.length==3)
                {
		supportedLocales=new Locale(args[0],args[1],args[2]);
                }
		else if (args.length==2)
                {
		supportedLocales=new Locale(args[0],args[1]);
                }
		
		stats=ResourceBundle.getBundle("ListBundle",supportedLocales);
                System.out.println("Locale = " + supportedLocales);
                Integer gdp = (Integer)stats.getObject("GDP");
		System.out.println("GDP = " + gdp.toString());
		Integer pop = (Integer)stats.getObject("Population");
		System.out.println("Population = " + pop.toString());
		Double lit = (Double)stats.getObject("Literacy");
		System.out.println("Literacy = " + lit.toString()); 
	} // end main
}//end class
