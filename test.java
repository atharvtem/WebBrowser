class Solution {
    public static int[] rotate(int[] nums, int k) {
        int [] ans = new int[nums.length];
        for(int i=0;i<k;i++){
            ans[i]=nums[nums.length-1];
            for(int j=1;j<nums.length-1;j++){
                ans[j]=nums[j]+1;
            }
        }
        return ans;
    }
}

public class test{
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7};
        int [] arr2 = Solution.rotate(arr,3);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+",");
        }
    }
}