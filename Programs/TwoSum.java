public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int trg = 6;

        int[] res = twoSum(nums, trg);
        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i < res.length - 1) {
                System.out.print(", ");
            } }
        System.out.println("]");
    }

    public static int[] twoSum(int[] nums, int trg) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == trg) {
                    return new int[] {i, j}; }
            }
    }
        return new int[] {};
    }
}