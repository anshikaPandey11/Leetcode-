class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
        return false;
       } 
        int originalNumber = x;
        int reversedNumber = 0;
        while (x> 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }
        // Check if the original number is equal to its reverse
        return originalNumber == reversedNumber;
    }
}
