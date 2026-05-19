class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> ans=new HashSet<>();
        for(int i:nums){
            if(!ans.add(i))
            return true;
            ans.add(i);
        }
        return false;
    }
}