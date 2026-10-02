class Solution {
    public int countCharacters(String[] words, String chars) {
       
       int[] scnt = new int[26] ;
       for(char ch : chars.toCharArray()) {
          scnt[ch - 'a']++ ; 
       }
      int ans = 0 ;
    for ( String word : words) {
        int[] wcnt = new int[26] ;
        for (char ch : word.toCharArray()) {
            wcnt[ch -'a']++ ;
        }

        boolean good = true ;
        for (int i =0 ;i<26 ; i++) {
            if(scnt[i] < wcnt[i]) {
              good = false ;
              break ;
            }
        }
        if(good) {
                ans += word.length() ;
            }
    }
       return ans ;
    }
}