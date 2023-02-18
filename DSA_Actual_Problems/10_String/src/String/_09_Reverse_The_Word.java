/**
* @Developer : Sagar_Pokale
* 19-Jan-2023 6:55:25 AM
**/

package String;

public class _09_Reverse_The_Word {

	public static void main(String[] args) {

		String str = "Welcome to GFG";
		System.out.println(str);

		reverseWord(str.toCharArray(), str.length());

//		System.out.println(str);

	}

//	Not required extra space
	private static void reverseWord(char str[], int n) {

		int start = 0;
		for (int end = 0; end < n; end++) {
			if (str[end] == ' ') {
				reverse(str, start, end - 1);
				start = end + 1;
			}
		}

//				System.out.println(str[end]);
		reverse(str, start, n -1);
		reverse(str, 0,n -1);
		System.out.println(str);

	}

	private static void reverse(char[] str, int low, int high) {
		while (low <= high) {
//			System.out.println("Before low = "+str[low]+" High = "+str[high]);
			
			swap(str, low, high);
//			System.out.println("Before low = "+str[low]+" High = "+str[high]);
			low++;
			high--;
//			System.out.println(str);
		}
	}

	private static void swap(char [] str, int a, int b) {
		char temp = str[b];
		str[b] =  str[a];
		 str[a] = temp;
	}

}
