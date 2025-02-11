class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];   
        }
        double M_avg=sum/k;
        for(int j=k;j<nums.length;j++)
        {
            sum+=nums[j]-nums[j-k];
            M_avg=Math.max(M_avg,sum/k);
        }
        return M_avg;
    }
}
