package week2.day1;

public class Palindrome {
	public static void main(String[] args) {

	    String str = "madam";
	    String revstr = "";

	// Add the char into rev
	   
	    char[] ca= str.toCharArray();
	   
	//Iterate over the String in reverse order

	    int size = ca.length;
	   
	for (int i=size-1; i>=0; i--)
	    {
	revstr = revstr + ca[i]; // Add the char into rev

	    }
	   
	// Compare the original String with the reversed String, if it is same then
	// print palinDrome

	    if (str.equals(revstr)){
	    System.out.println(str+ " is a polindrome");
	    }
	    else
	    {
	    System.out.println(str+ " is not a polindrome");
	    }
	}

	}


