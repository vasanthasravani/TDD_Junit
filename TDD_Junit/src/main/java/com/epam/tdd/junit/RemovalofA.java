package com.epam.tdd.junit;
public class RemovalofA {
	String remove(String word)
	{
		String newstring = "";
		int length=word.length();
		if(length==0)
		{
			return "";
		}
		else if((length==1 && word.equals("A")) || (length==2 && word.equals("AA")))
		{
			return "";
		}
		else 
		{
			if(word.charAt(0)=='A' && word.charAt(1)=='A')
			{
				newstring=word.substring(2,length);
			}
			else if(word.charAt(0)=='A' && word.charAt(1)!='A')
			{
				newstring=word.substring(1,length);
			}
			else if(word.charAt(0)!='A' && word.charAt(1)=='A')
			{
				newstring=word.charAt(0)+word.substring(2,length);
			}
			else
			{
				return word;
			}
		}
		return newstring;
	}
}