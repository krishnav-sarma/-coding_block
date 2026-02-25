package lec_10;
class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;

        k=k%n;
        reversed(nums,0,n-1);
        reversed(nums,0,k-1);
        reversed(nums,k,n-1);
    }
    void reversed(int[] arr, int s, int e){

        while(s<e){
            int t= arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}