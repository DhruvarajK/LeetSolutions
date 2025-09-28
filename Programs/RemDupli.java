class RemDupli { public int remove(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {

    RemDupli rd = new RemDupli();
    int[] nums = {1,1,1,2,2,3};
    int k = rd.remove(nums);
    System.out.println(k);
    for (int i = 0; i < k; i++) {
        System.out.print(nums[i] + " ");
    }
}
}