package com.coder.pad;

public class SubStringOfGivenLength 
{
	public static void SubString(String str, int n)
    {
       for (int i = 0; i < n; i++) 
       {
    	   for (int j = i+1; j <= n; j++)
    	   {
    		// Please refer below article for details
               // of substr in Java
               // https://www.geeksforgeeks.org/java-lang-string-substring-java/
    		   String substring = str.substring(i, j); 
    		   if (substring.length() == 2)
    			   System.out.println(substring);
    	   }
       }
    }
    public static void main(String[] args)
    {
        String str = "aab";
        SubString(str, str.length());
    }
}
