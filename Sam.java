package com.phenom.queries;

public class Sam {
	public static void main(String[] args) {
		String ch="HelloWorld";
		char ch1[]=ch.toCharArray();
		toUpperCase(ch1);
	}
	public static void toUpperCase(char check[])
	{
		String s="";
		for (int i = 0; i < check.length; ++i) {
			if(Character.isLowerCase(check[i])&& Character.isAlphabetic(check[i]))
			{
				check[i]=(char) (check[i]-32);
			}
			s+=check[i];
		}
		System.out.println(s);
	}
}
