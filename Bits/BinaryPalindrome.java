//Check if binary representation of a number is palindrome
//
//Given an integer ‘x’, write a C function that returns true if binary
//representation of x is palindrome else return false.
//
//For example a numbers with binary representation as 10..01 is palindrome
//and number with binary representation as 10..00 is not palindrome.
//
//The idea is similar to checking a string is palindrome or not. We start
//from leftmost and rightmost bits and compare bits one by one.
//If we find a mismatch, then return false. 

public class BinaryPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=112;
		System.out.println(isPalindrome(x));
	}

	private static Boolean isPalindrome(int x) {
		// TODO Auto-generated method stub
		int front=0;
		int back=Integer.SIZE;
		while(front<back)
		{
			if(isKthBit(x,front)!=isKthBit(x,back))
				return false;
			
			front++;
			back--;
		}
		return true;
	}

	private static Boolean isKthBit(int x, int k) {
		// TODO Auto-generated method stub
		if((x&(1<<k))==0)
			return false;
		else
			return true;
	}
}
