package Assignment;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	String str1;
	String str2;
	Scanner sc=new Scanner(System.in);
	    void isAnagram() {  
	    	System.out.println("Enter Word to be converted in to anagram");
	    	str1=sc.nextLine();
	    	System.out.println("Enter word to check anagram");
	    	str2=sc.nextLine();
	        String s1 = str1.replaceAll("\\s", "").replaceAll("!","");  
	        String s2 = str2.replaceAll("\\s", "").replaceAll("!","");  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println(s1 + " is angram of " + s2  );  
	        } else {  
	            System.out.println(s1 + " is not anagram of  " + s2 );  
	        }  
	    }  
	   
	    public static void main(String[] args) {  
	    	AnagramString ana=new AnagramString();  
	    	ana.isAnagram();
	    }  
	}  

