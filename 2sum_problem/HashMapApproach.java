class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] a=new int[2];
        HashMap<Integer,Integer> H=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int sno=target-nums[i];
            if(H.containsKey(sno))
            {
                a[0]=H.get(sno);
                a[1]=i;
                break;
            }
            H.put(nums[i],i);
        }
       
        return a;
        
    }
}
