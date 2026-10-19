class Solution {
    public List<Integer> partitionLabels(String s) {

        int[] last = new int[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            if (i == end) {
                list.add(i - j + 1);
                j = i + 1;
            }
        }
        return list;
    }
}