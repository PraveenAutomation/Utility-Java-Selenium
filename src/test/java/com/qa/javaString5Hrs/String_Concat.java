package com.qa.javaString5Hrs;

public class String_Concat {

	public static void main(String[] args) {
		String s="VDS";
		s=s.concat("TECH");
		System.out.println(" "+s);
		s=s+"Labs";
		System.out.println(" "+s);
		s+="Softwares";
		System.out.println(" "+s);
		
		/* .equals(),.equalsIgnoreCase(),isEmpty(),length(),[length variable is only applicable for Array Object],
		 * - replace(char old, char new)
		 * - substring(int begin)
		 * - substring(int begin, int end)-->return from begin to end-1
		 * - indexOf(char ch)
		 * - lastIndexOf(char ch)
		 * 
		 * 
		 * 
		 */
		
		System.out.println(s.indexOf("D"));
		System.out.println(s.indexOf(1));
		System.out.println(s.lastIndexOf("D"));

	}

}
