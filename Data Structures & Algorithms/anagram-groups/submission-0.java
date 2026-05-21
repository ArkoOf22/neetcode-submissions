class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //make a character array using the each word
        //Lets do it in steps
        HashMap<String, List<String>> hmap=new HashMap<>();
        for(String s:strs){
            //1. Make the frequency array
           int arr[]=new int[26];
           for(char a:s.toCharArray()){
            arr[a-'a']++;
           }
           StringBuilder sb=new StringBuilder();
           for(int a:arr){
            sb=sb.append(a).append(".");
           }
           String key=sb.toString();
           hmap.putIfAbsent(key, new ArrayList<>());
           hmap.get(key).add(s);
        }
        return new ArrayList<>(hmap.values());
    }
}
