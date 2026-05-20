class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int[] ans=new int[128];
        Arrays.fill(ans,0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans[(int)ch]++;
            char cs=t.charAt(i);
            ans[(int)cs]--;
        }
        for(int i=0;i<128;i++){
            if(ans[i]!=0)
            return false;
        }
        return true;
        

    }
}
