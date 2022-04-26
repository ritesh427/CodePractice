// class RemoveNumber {
	// public static String removeAllDigit(String str)
	// {
		// char[] charArray = str.toCharArray();
		// String result = "";
		// for (int i = 0; i < charArray.length; i++) {
			// if (!Character.isDigit(charArray[i])) {
				// result = result + charArray[i];
			// }
		// }
		// return result;
	// }
	// public static void main(String args[])
	// {
		// String str = "GeeksForGeeks123";
		// System.out.println(removeAllDigit(str));
	// }
// }

// Type 2

// class GFG {
	// public static String removeAllDigit(String str)
	// {
		// String result = "";
		// for (int i = 0; i < str.length(); i++) {
			// if (!Character.isDigit(str.charAt(i))) {
				// result = result + str.charAt(i);
			// }
		// }
		// return result;
	// }
	// public static void main(String args[])
	// {
		// String str = "GeeksForGeeks123";
		// System.out.println(removeAllDigit(str));
	// }
// }

// Type 3

class RemoveNumbers {
	public static String removeAllDigit(String str)
	{
		return str.replaceAll("\\d", "");
	}
	public static void main(String args[])
	{
		String str = "GeeksForGeeks123";
		System.out.println(removeAllDigit(str));
	}
}
