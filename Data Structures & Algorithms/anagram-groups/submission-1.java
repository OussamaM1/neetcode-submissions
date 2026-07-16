class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s : strs) {
            String sortedS = sortString(s);
            if(!hs.containsKey(sortedS)) {
                hs.put(sortedS, new ArrayList<>(List.of(s)));
            } else {
                List<String> group = hs.get(sortedS);
                group.add(s);
                hs.put(sortedS, group);
            }
        }
        for(Map.Entry<String, List<String>> entry : hs.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }


    public String sortString(String s) {
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
