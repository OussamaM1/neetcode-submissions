class Solution {
    public boolean isAnagram(String s, String t) {
        // first we check if the s and t have the same size
        if (s.length() != t.length())
            return false;
        // then we need an array that contains the 28 character
        // then we increament and decrement based on the values of t and s
        int ans[] = new int[(int)'z'+1];
        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i)]++;
            ans[t.charAt(i)]--;
        }
        for (int a : ans) {
            if(a!=0) return false;
        }
        return true;
    }
}
