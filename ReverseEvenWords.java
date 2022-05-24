package week2.day1;

public class ReverseEvenWords {
public static void main(String[] args) {
	String test = "I am a software tester";
	String [] split = test.split(" ");
	String temp = " ";
	for(int i=0; i<split.length; i++) {
		String revstr = " ";
		if ((i+1) %2 == 0) { 
			char[] charArray = split[i].toCharArray();
			for (int j= charArray.length - 1; j>=0; j--) {
				revstr = revstr + charArray[j];
			}
			temp = temp + revstr + " ";
			
			}
		else
		{
		temp = temp + split[i]+" ";
		}
	}
	System.out.println(temp);
		}
	
}
