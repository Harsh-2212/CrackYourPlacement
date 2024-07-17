class Solution19 {
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return nums[j];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
}