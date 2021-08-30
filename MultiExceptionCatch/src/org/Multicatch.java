package org;

public class Multicatch {

	public static void main(String[] args) {
		String welcome = "Welcome";
		char[] chars = welcome.toCharArray();
		
		
			try {
				char lastChar=chars[chars.length-1];
				System.out.println(lastChar);
				
				String sub=welcome.substring(10);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Array index Problem ");
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("String index Problem ");
			}
			
		

	}

}
