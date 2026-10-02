class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop" ;
        String row2 = "asdfghjkl" ;
        String row3 = "zxcvbnm" ;
        List<String> list = new ArrayList<>() ;

       for (String s : words) {
         if (isInRow(s,row1) || isInRow(s,row2) || isInRow(s,row3)) {
            list.add(s) ;
         }
       }
       return list.toArray(new String[0]) ;
    }

    public static boolean isInRow (String s , String row) {

        for (char ch : s.toCharArray()) {
            if(row.indexOf(Character.toLowerCase(ch)) == -1) {
                return false ;
            }
        }
        return true ;
    }
}