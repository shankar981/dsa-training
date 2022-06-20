// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        char nums[]= {'b','a','b'};
        int first = 0, high = nums.length - 1,mid = 0;
        char temp;
        while (mid <= high)
        {
            switch (nums[mid])
            {
                case 'a':
                {
                    temp = nums[first];
                    nums[first] = nums[mid];
                    nums[mid] = temp;
                    first++;
                    mid++;
                    break;
                }
                case 'b':
                    mid++;
                    break;
                case 'c':
                {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
