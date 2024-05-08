package com.phenom.queries;

public class ToUpperCase {
	public static void main(String[] args) {
		String s = "HelloWorld";
		toUpperCase(s);
		System.out.println(tc1ForJumbledCharacters());
		System.out.println(tc2ForJumbledCharacters_WithSpace());
		System.out.println(tc3ForNull());
		System.out.println(tc4ForNumbersAndCharacters());
		System.out.println(tc5ForMixedRegex());
		System.out.println(tc6ForMixedRegex_WithPrefixSpace());
		System.out.println(tc7ForUpperCaseString());
		System.out.println(tc8ForLowerCaseString());
		System.out.println(tc9ForEmptyString());
		System.out.println(tc10ForEmptyCharacter());
	}

	public static boolean tc1ForJumbledCharacters() {
		String input = "cHaNdU";
		String expected = "CHANDU";
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static boolean tc2ForJumbledCharacters_WithSpace() {
		String input = "cHanDra SeKHar";
		String expected = "CHANDRA SEKHAR";
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static boolean tc3ForNull() {
		String input = null;
		String expected = null;
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static boolean tc4ForNumbersAndCharacters() {
		String input = "1185abCD";
		String expected = "1185ABCD";
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static boolean tc5ForMixedRegex() {
		String input = "ki%#$@!eER0";
		String expected = "KI%#$@!EER0";
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static boolean tc6ForMixedRegex_WithPrefixSpace() {
		String input = "       ki%#$@!eER0";
		String expected = "       KI%#$@!EER0";
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static boolean tc7ForUpperCaseString() {
		String input = "UPPER";
		String expected = "UPPER";
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static boolean tc8ForLowerCaseString() {
		String input = "lower";
		String expected = "LOWER";
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static boolean tc9ForEmptyString() {
		String input = "";
		String expected = "";
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static boolean tc10ForEmptyCharacter() {
		String input = "a";
		String expected = "A";
		String result = toUpperCase(input);
		return result.equals(expected);
	}

	public static String toUpperCase(String s) {
		String result = "";
		char check[] = s.toCharArray();
		for (int i = 0; i < check.length; ++i) {
			if (Character.isLowerCase(check[i]) && Character.isAlphabetic(check[i])) {
				check[i] = (char) (check[i] - 32);
			}
			result += check[i];
		}
		return result;
	}
}
