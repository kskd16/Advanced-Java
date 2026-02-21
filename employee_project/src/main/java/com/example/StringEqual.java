package com.example;

public class StringEqual {
	public boolean isPallindrome(String str) {
		StringBuilder newStr = new StringBuilder(str);
		if(newStr.toString().equalsIgnoreCase(newStr.reverse().toString())){
			return true;
		}
		return false;
	}
	public boolean isArmstrong(int n){
		
	        int original = n;
	        int digits = String.valueOf(n).length();
	        int sum = 0;

	        while (n > 0) {
	            int digit = n % 10;
	            sum += Math.pow(digit, digits);
	            n /= 10;
	        }
	        return sum == original;

	       
	}

}
