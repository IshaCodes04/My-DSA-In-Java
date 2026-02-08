// Leetcode ques 26. Remove Duplicates from sorted array.

// Given :- Ek integer array nums jo sorted h non-decreasing order mein for ex - [1,1,2,2,3,4,4,4,5]

// Task :- Remove duplicates In-Place - means we don't create any extra array, every changes occurs in same array.

// Har unique element sirf ek br he ayega 

// Relative order same rhega - mean jo order pehle tha whi rhega

// Return :- K = How many unique elements we have 

// Phele k element mein unique numbers sorted order mein hone chahiye

// Important points :-

// First k elements contain unique numbers - yahi important hai
// Baaki elements (k ke baad) ko ignore kar sakte ho - unhe kuch bhi chhod sakte ho

// Example :- 

// Input: nums = [1,1,2]

// Output: k = 2, nums = [1,2,_]

// Explanation:
// - Unique elements = 1 and 2 (2 elements)
// - Return k = 2
// - First 2 positions mein [1,2] hona chahiye
// - 3rd position pe kuch bhi ho sakta hai (_ means don't care)

class Solution {
    public int removeDuplicates(int[] nums) {
        // EDGE CASE: Agar array empty hai
        if (nums.length == 0) {
            return 0;  // Koi unique element nahi
        }
        
        /* 
         * i = unique elements ki position track karta hai
         * Initially i=0 kyunki pehla element hamesha unique hota hai
         */
        int i = 0;
        
        /* 
         * j pointer array ko traverse karta hai
         * j=1 se start kyunki 0th element already unique consider kar chuke
         */
        for (int j = 1; j < nums.length; j++) {
            
            // CHECK: Kya current element previous unique element se different hai?
            if (nums[j] != nums[i]) {
                // Haan different hai! Matlab yeh ek NAYA unique element hai
                
                i++;  // i ko next position pe move karo
                
                nums[i] = nums[j];  // Is position pe naya unique element rakho
            }
            // Agar nums[j] == nums[i] (same hai), toh kuch nahi karo
            // Bas j++ hoga loop mein, duplicate skip ho jayega
        }
        
        // Return total unique elements = i ka index + 1
        return i + 1;
    }
}


// ## **Detailed Example Walkthrough:**

// **Input:** `nums = [1,1,1,2,2,3,3]`

// Starting: i=0, nums = [1,1,1,2,2,3,3]
//          ↑ i pointer (first unique = 1)

// Step 1: j=1
//        nums[1]=1, nums[0]=1 → SAME! Skip karo
//        i=0 (no change)
        
// Step 2: j=2
//        nums[2]=1, nums[0]=1 → SAME! Skip karo
//        i=0 (no change)

// Step 3: j=3
//        nums[3]=2, nums[0]=1 → DIFFERENT! Naya unique mila
//        i++ → i=1
//        nums[1] = nums[3] = 2
//        nums = [1,2,1,2,2,3,3]
//               ↑ ↑
//               i j

// Step 4: j=4
//        nums[4]=2, nums[1]=2 → SAME! Skip karo
//       i=1 (no change)

// Step 5: j=5
//        nums[5]=3, nums[1]=2 → DIFFERENT! Naya unique mila
//        i++ → i=2
//        nums[2] = nums[5] = 3
//        nums = [1,2,3,2,2,3,3]
//               ↑   ↑
//               i   j

// Step 6: j=6
//        nums[6]=3, nums[2]=3 → SAME! Skip karo
//        i=2 (no change)

// Loop khatam!

// Return: i+1 = 2+1 = 3
// Final: nums = [1,2,3,_,_,_,_]
//              First 3 unique elements ✓

