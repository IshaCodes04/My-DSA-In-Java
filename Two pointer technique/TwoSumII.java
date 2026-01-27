// leetcode ques 167. Given a 1-indexed --------------- space?

// given :- sorted array numbers , target
// find :- exactly one soln exist , 1-based indexing return , exrta space doen't allowed

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{ i + 1, j + 1 };
            }
            else if (sum < target) {
                i++;   // sum chhota hai → bada karo
            }
            else {
                j--;   // sum bada hai → chhota karo
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4};
        int target = 6;

        int[] ans = twoSum(numbers, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}


