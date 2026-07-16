class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] preGcd = new int[n];
        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
            preGcd[i] = gcd(nums[i], maxVal);
        }

        Arrays.sort(preGcd);

        long sum = 0;
        int l = 0, r = n - 1;

        while (l < r) {
            sum += gcd(preGcd[l], preGcd[r]);
            l++;
            r--;
        }

        return sum;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
