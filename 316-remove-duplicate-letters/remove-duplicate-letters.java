class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] cnt = new int[26];

        for (char ch : s.toCharArray()) {
            cnt[ch - 'a']++;
        }

        boolean[] visited = new boolean[26];

        for (char ch : s.toCharArray()) {
             cnt[ch - 'a']--;

            if (visited[ch - 'a']) {
                continue;
            }

            while (!st.isEmpty() && st.peek() > ch && cnt[st.peek()- 'a'] > 0) {
                visited[st.peek()-'a'] = false;
                st.pop();
            }

            st.push(ch);
            visited[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();

        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
    }
}