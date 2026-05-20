class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Key is to sort and compare the first and last array
        Arrays.sort(strs);
        char first[]=strs[0].toCharArray();
        char last[]=strs[strs.length-1].toCharArray();
        String ans="";
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                return ans;
            }
            ans+=first[i];
        }
        return ans;
    }
}