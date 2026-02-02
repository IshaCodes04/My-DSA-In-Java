// leetcode ques 167. Given a 1-indexed --------------- space?

// given :- sorted array numbers , target
// find :- exactly one soln exist , 1-based indexing return , exrta space doen't allowed

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {

        int i = 0; // i = 0 th index pe h left pointer
        int j = numbers.length - 1; // j = n-1 end pointer pe h right side

        while (i < j) { // jb tk pointers cross na ho jaye tb tk chlega

            int sum = numbers[i] + numbers[j]; // current pair sum , 9 = 2+7 

            if (sum == target) { // if targer is equal to sum 
                return new int[]{ i + 1, j + 1 }; // then 1-based indexing return kr denge
            }
            else if (sum < target) {
                i++;   // sum chhota hai → i bada karo
            }
            else {
                j--;   // sum bada hai → j chhota karo
            }
        }

        return new int[]{}; // return krdo int ko
    }

    public static void main(String[] args) {

        int[] numbers = {4, 3, 2 ,6};
        int target = 10;

        int[] ans = twoSum(numbers, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
