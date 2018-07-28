class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        HashSet<Character> tracker = new HashSet<Character>();
        for(int i = 0; i < J.length(); i++){
            tracker.add(J.charAt(i));
        }
        for(int k = 0; k < S.length(); k++){
            if(tracker.contains(S.charAt(k))) result++;
        }
        return result;
    }
}