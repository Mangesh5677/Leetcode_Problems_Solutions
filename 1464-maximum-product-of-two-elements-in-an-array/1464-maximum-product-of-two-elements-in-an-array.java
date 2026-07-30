class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int max=0;
        for(int i=0;i<n-1;i++){
         for(int j=i+1;j<n;j++){
            int max1=nums[i]-1;
            int max2=nums[j]-1;
            int product=max1 * max2;

            if(max<product){
                max=product;
            }
         }
        }
         return max;
    }
}