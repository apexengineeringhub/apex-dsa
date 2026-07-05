# Problem

LeetCode: 704 - Binary Search

Link: https://leetcode.com/problems/binary-search/description/

## Pattern

Primary Pattern: Binary Search 

Secondary Pattern (Optional):

### Difficulty

Easy 

### Algorithm

- 1 Initialize left = 0 and right = nums.length - 1
- 2 Calculate mid = left + (right - left) / 2
- 3 If nums[mid] value equal to target return mid value
- 4 If target is greater than nums[mid] update left = mid+1
- 5 If target is less than mid update right = mid-1
- 6 Target not found return -1




### Key Points

- 1 Array should be sorted 
- 2 Right value will be nums.length-1
- Use left + (right - left) / 2 to avoid integer overflow.

## Complexity

### Time Complexity:  O(log n)


### Space Complexity:  O(1) 


## Common Mistakes 
-  Don't apply it when array is not sorted
- Using left < right instead of left <= right. 
- Updating the wrong pointer (left or right).

### Similar Problems
- LC 35 – Search Insert Position
- LC 33 – Search in Rotated Sorted Array
- LC 153 – Find Minimum in Rotated Sorted Array

## Interview Tips 
- Mention that the array is sorted before choosing Binary Search.
- State the time complexity before writing code.
- Explain why the midpoint calculation avoids overflow.

## Revision History
| Date          | 	Status |	Notes|
|---------------|---------|---|
| 2026-07-05 | Solved  |First Attempt|