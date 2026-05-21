class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap=new HashMap<>();
        for(int i:nums){
            hmap.put(i, hmap.getOrDefault(i,0)+1);
        }
        int len=nums.length;
        for(Map.Entry<Integer, Integer> ans:hmap.entrySet()){
            if(ans.getValue()>len/2)
            return ans.getKey();
        }
        return -1;
    }
}