package com.epam.JunitTask;

public class RemoveAatFirst2CharsInStr {
	public String remove(String string)
	{
		
		if((string.charAt(0)!='A') && (string.charAt(1)!='A'))
			 return string;
		
		if((string.charAt(0)=='A') && (string.charAt(1)=='A'))
			
			return  string.substring(2,string.length()); 
		 
		if(string.charAt(1)=='A')
			 return  string.charAt(0) + string.substring(2, string.length());
		
		return string.substring(1,string.length());
	}
}
