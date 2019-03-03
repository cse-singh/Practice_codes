package com.kogent.i18n;
import java.util.Locale; 
public class Locales
{
	public static void main(String s[]) throws Exception 
	{
		Locale myLocale=null;
		String language=null;
		String country=null;
		myLocale = new Locale("en", "US");
		language = myLocale.getDisplayLanguage();
		System.out.println(language);
		country=myLocale.getDisplayCountry();
		System.out.println(country);
		System.out.println(myLocale.getDisplayLanguage(Locale.FRENCH));
		System.out.println(myLocale.getDisplayCountry(Locale.FRENCH));
	}
}

