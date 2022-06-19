class Solution {
    public void sortColors(int[] nums)
    { 
        
        int firstindex = 0;
        int highindex = nums.length - 1;
        int midindex = 0, temp = 0;
        while (midindex <= highindex) 
        {
            switch (nums[midindex])
            {
                case 0:
                {
                    temp = nums[firstindex];
                    nums[firstindex] = nums[midindex];
                    nums[midindex] = temp;
                    firstindex++;
                    midindex++;
                    break;
                }
                case 1:
                    midindex++;
                    break;
                case 2: 
                {
                    temp = nums[midindex];
                    nums[midindex] = nums[highindex];
                    nums[highindex] = temp;
                    highindex--;
                    break;
                }
            }
        }
    }
}
