
public class Buzz {
	public static void main(String args[]) {
		System.out.println(0);
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0) {
				System.out.println("Buzz");
			} 
			
			else if(String.valueOf(i).length() == 1 || String.valueOf(i).length() == 3) {
				System.out.println(i);
			}
			else if (String.valueOf(i).length() == 2) {
				String strNum = String.valueOf(i);
				if (strNum.charAt(0) == '3' && strNum.charAt(1)== '3') {
					System.out.println("Buzz Buzz");
				}
				
				else if (strNum.charAt(0) == '3') {
					System.out.println("Buzz " + strNum.charAt(1));
				}
				
				else if (strNum.charAt(1) == '3') {
					System.out.println(strNum.charAt(0) + " Buzz");
				} else {
					System.out.println(i);
				}
			}
				
		}
	}
}
