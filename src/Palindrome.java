public class Palindrome {
    public boolean isPalindrome(String str) {
        StringBuilder GivenString = new StringBuilder(str);
        if(str.equals(GivenString.reverse().toString()))
            return true;
        return false;
    }
}
