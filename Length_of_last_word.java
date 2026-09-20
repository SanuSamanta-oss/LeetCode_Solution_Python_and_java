class Solution {
    public int lengthOfLastWord(String s) {
        int str_length = s.length() - 1;

        // Skip spaces
        while( str_length >= 0 && s.charAt(str_length) == ' '){
            str_length--;
        }
        int count = 0;
        while( str_length >= 0 && s.charAt(str_length) != ' '){
            count++;
            str_length--;
        }
        return count;
    }
}