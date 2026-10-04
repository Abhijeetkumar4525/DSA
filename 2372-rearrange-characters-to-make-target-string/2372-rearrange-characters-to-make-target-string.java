class Solution {
    public int rearrangeCharacters(String s, String target) {
        char[] tfreq = new char[26];

        for (char ch : target.toCharArray()) {
            tfreq[ch - 'a']++;
        }

        char[] sfreq = new char[26];

    
        for (int j = 0; j < s.length(); j++) {
            sfreq[s.charAt(j) - 'a']++;
        }
 
        int ans = Integer.MAX_VALUE ;
        for (int i=0 ; i < 26 ; i++) {
            if(tfreq[i] > 0) {
               ans = Math.min(ans ,sfreq[i] / tfreq[i]) ;
            }
        }
        return ans;
    }
}