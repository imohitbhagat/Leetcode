class Solution {
    public int countVowelSubstrings(String word) {
        
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < word.length()-4; i++){
            set.clear();
            for(int j = i; j < word.length(); j++){
                char curr = word.charAt(j);
                if(hs.contains(curr)){
                    set.add(curr);
                    if(set.size() >= 5)
                        ans++;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
        
}
