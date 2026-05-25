class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap=new HashMap<>();
        for(int i:nums){
            hmap.put(i, hmap.getOrDefault(i,0)+1);
        }
        Map<Integer, Integer> sortedByValueDesc =
        hmap.entrySet()
           .stream()
           .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
           .collect(
               LinkedHashMap::new,
               (m, e) -> m.put(e.getKey(), e.getValue()),
               LinkedHashMap::putAll
           );
           int arr[]=new int[k];
           int j=0;
           for(Map.Entry<Integer,Integer> ans: sortedByValueDesc.entrySet()){
            if(j>=k)
            break;
            else
            arr[j++]=ans.getKey();
           }
return arr;
    }
        }

