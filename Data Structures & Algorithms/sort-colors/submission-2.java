class Solution {
    public void sortColors(int[] arr) {
       //Lets try using dutch national flag algorithm
       //Keep three pointers, low, mid and high
       //Incremement and swap low if we find the arr[mid]=0,
       //Increment mid if arr[mid]=1,
       //Decrement high if arr[mid]=2
       int low=0, mid=0, high=arr.length-1;
       while(mid<=high){
        if(arr[mid]==0){
            int temp=arr[mid];
            arr[mid++]=arr[low];
            arr[low++]=temp;
        }
        else if(arr[mid]==1){
            mid++;
        }
        else{
            int temp=arr[high];
            arr[high--]=arr[mid];
            arr[mid]=temp;
        }
       }
    }
}