class Solution {
    public String reverseVowels(String s) {
        int n = s.length() ; 

        char[] str = s.toCharArray() ;
        int i = 0;
        int j = n-1 ;

        while ( i < j) {
              
             if(!isVowel(str[i])) {
                i++ ;
             } else if(!isVowel(str[j])) {
                j--;
             } else {
                char temp = str[i] ;
                str[i] = str[j] ;
                str[j] = temp ;
                i++;
                j--;
             }
        }
        return new String(str) ;
    }

    public static boolean isVowel(char ch) {

        return (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'O' ||ch == 'E' ||ch == 'I' ||ch == 'U'  ) ? true : false ;
        
    }
}