package RemoveElement
/*27. Remove Element
* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

class Solution {
    fun removeElement(nums: IntArray,  k: Int): Int {
       var elementRemove = 0
        for (i in 0 until nums.size){
            if (nums[i] != k){
                nums[elementRemove] = nums[i]
                elementRemove++
            }
        }
        println("after remove all occurrences:${nums.contentToString()}")
        return elementRemove
    }
/*this code remove all numbers occurrences in intArray and return array size */
    //        var elementsRemove = k
//
//            var result = nums.filter { it != elementsRemove }.toIntArray()
//
//        print("Original Array ${nums.contentToString()}\t")
//        println("after remove all occurrences:${result.contentToString()}")
//            elementsRemove = result.size
//
//        return elementsRemove

}
fun main(){
    val example1: IntArray = intArrayOf(3,2,2,3)
    val example2:IntArray = intArrayOf(0,1,2,2,3,0,4,2)
    val result = Solution()
    println("Example 1 ${result.removeElement(example1,3)}")
    println("Example 2 ${result.removeElement(example2,2)}")


}