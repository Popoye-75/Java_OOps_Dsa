# DSA Pattern-Based Practice Questions

Each topic has 10 questions: 4 Easy, 4 Medium, 2 Hard.
Language is kept simple and clear.

---

## 1. Two Pointers

Problems solved using two pointers moving from both ends or together across an array/string.

### Easy
**Q1.** You are given a sorted array of numbers and a target number. Find two numbers from the array that add up exactly to the target. Return their positions (index).

Example:
```
Input: arr = [2, 7, 11, 15], target = 9
Output: [0, 1]
Reason: arr[0] + arr[1] = 2 + 7 = 9
```

**Q2.** You are given an array containing some zeros. Move all the zeros to the end of the array while keeping the order of the other numbers the same.

**Q3.** You are given a string. Check whether it is a palindrome (reads the same forwards and backwards).

**Q4.** You are given two sorted arrays. Merge them into a single sorted array.

### Medium
**Q5.** You are given a sorted array that may contain duplicate numbers. Remove the duplicates and keep only unique numbers at the start of the array, without using extra space.

**Q6.** You are given an array. Find three numbers whose sum is zero (triplets), and return all unique triplets.

**Q7.** You are given an array representing heights (like walls of a container). Choose two lines that can hold the most water, and find that maximum amount of water.

**Q8.** You are given a string. Find the minimum number of characters you need to remove to make it a palindrome (use the two-pointer approach to check this).

### Hard
**Q9.** You are given an array of heights (like a skyline of buildings). Calculate how much water would get trapped after rain.

**Q10.** You are given a sorted array and a target sum. Find four numbers (quadruplets) whose sum equals the target, and return all unique quadruplets.

---

## 2. Sliding Window

Problems solved by sliding a window (a small portion) over an array/string.

### Easy
**Q1.** You are given an array and a number k. Find the sum of every subarray of size k, and find the subarray with the maximum sum.

**Q2.** You are given an array. Find the average of every window of size k.

**Q3.** You are given a string. Find its smallest substring that has no repeating characters.

**Q4.** You are given an array and a target sum. Find the smallest subarray whose sum is greater than or equal to the target.

### Medium
**Q5.** You are given a string and a pattern. Check whether any anagram (rearrangement of letters) of the pattern exists within the string.

**Q6.** You are given a string in which a substring can contain only 2 distinct characters. Find the longest such substring.

**Q7.** You are given an array of characters (like the "fruits into baskets" problem) — you can only collect 2 types continuously. Find the maximum number of fruits you can collect.

**Q8.** You are given a string in which a substring can contain at most k distinct characters. Find the longest such substring.

### Hard
**Q9.** You are given a string and a pattern. Find the smallest substring of the string that contains all the characters of the pattern (including their counts).

**Q10.** You are given an array. Find the longest subarray where, by flipping at most k elements (for example, changing 0s to 1s), all elements can be made the same (longest subarray of 1s after flipping at most k zeros).

---

## 3. Kadane's Algorithm

Problems that involve finding the maximum or minimum subarray sum.

### Easy
**Q1.** You are given an array containing both positive and negative numbers. Find its maximum subarray sum (you must pick at least one element).

**Q2.** You are given an array. Find its minimum subarray sum.

**Q3.** You are given an array. Along with the maximum subarray sum, also return the start and end index of that subarray.

**Q4.** You are given an array. Find the maximum subarray sum considering the whole array (also handle the case where all numbers are negative).

### Medium
**Q5.** You are given a circular array (where after the last element, it wraps around to the first element again). Find its maximum subarray sum.

**Q6.** You are given an array. Find the subarray with the maximum product (not sum — this needs special handling for negative numbers).

**Q7.** You are given a 2D matrix. Find the rectangle (submatrix) with the maximum sum.

**Q8.** You are given an array where you're allowed to delete one element. After deleting an element, what is the maximum possible subarray sum?

### Hard
**Q9.** You are given an array. Find two non-overlapping subarrays whose combined sum is maximum.

**Q10.** You are given an array. Find k non-overlapping subarrays whose combined sum is maximum.

---

## 4. Prefix Sum

We build a prefix sum array to answer range sum queries quickly.

### Easy
**Q1.** You are given an array. Multiple queries will come, each giving a range (left, right) — find the sum of that range quickly.

**Q2.** You are given an array. Check if there is an index where the sum of the left side equals the sum of the right side (equilibrium index).

**Q3.** You are given an array. For every index, find the product of all elements except itself (without using division — using prefix and suffix products).

**Q4.** You are given an array containing only 0s and 1s. Find the longest subarray where the count of 0s and 1s is equal.

### Medium
**Q5.** You are given an array and a number k. Count how many subarrays have a sum exactly equal to k.

**Q6.** You are given an array. Count how many subarrays have a sum divisible by k.

**Q7.** You are given a 2D matrix. Multiple queries will come, each giving a rectangular region — find the sum of that region quickly.

**Q8.** You are given a binary array (0s and 1s). Find the longest subarray where the count of 1s is exactly one more than the count of 0s.

### Hard
**Q9.** You are given an array. Find the smallest subarray whose sum is greater than a given value (the array can also contain negative numbers).

**Q10.** You are given an array. Count how many subarrays have a sum that falls within a given range [low, high].

---

## 5. Difference Array

Used when multiple ranges need to be updated (add/subtract) at once.

### Easy
**Q1.** You are given an array of size n (starting with all zeros). Multiple operations will come, each giving (start, end, value) — add the value to all elements in that range. Return the final array after all operations.

**Q2.** You have a calendar/booking system. Multiple bookings will come (start day, end day) — check how many bookings overlap on any given day, and find the maximum overlap.

**Q3.** You are given an array. Multiple range-increment operations are given. After applying all operations, find the maximum value in the array.

**Q4.** You have a parking lot / seat booking system where ranges get booked. After each range is booked, track the total number of seats used so far.

### Medium
**Q5.** You are given a list of flight bookings (a range of flight numbers and number of seats). Find the total number of seats booked for each flight.

**Q6.** You are given an array. Multiple range queries are given, each requiring you to increment the elements in that range by a fixed value. After all the queries, print the entire final array.

**Q7.** You are given an array representing something like a road where work is happening. Multiple (start km, end km) ranges are given where there is traffic. Find the maximum number of overlapping traffic ranges at any point (efficiently, without checking every point one by one).

**Q8.** You are given an event scheduling problem — multiple events (start time, end time) are given. Efficiently find how many events are running at a particular time (without checking every event individually).

### Hard
**Q9.** You are given a 2D grid. Multiple rectangular regions are given, each requiring a value to be added inside that region. Find the final grid after all operations (2D difference array).

**Q10.** You are given an array. Multiple range operations are given where you need to multiply the elements in each range (instead of adding). Efficiently find the final array.

---

## 6. Binary Search

Fast searching on sorted data, and "binary search on answer" where we search for an answer based on a condition.

### Easy
**Q1.** You are given a sorted array and a target number. Find the index of the target (if it exists).

**Q2.** You are given a sorted array. Find the position where the target could be inserted while keeping the order (if the target doesn't already exist).

**Q3.** You are given a sorted array that contains duplicates. Find the first and last occurrence of the target number.

**Q4.** You are given a number. Find its square root without using a built-in sqrt function (up to the integer part).

### Medium
**Q5.** You are given a sorted array that has been rotated at some point (for example, [4,5,6,7,0,1,2]). Find the index of a target number.

**Q6.** You are given an array shaped like a mountain (first increasing, then decreasing). Find its peak element (the largest number).

**Q7.** You are given some books, each with a certain number of pages, and m students. Divide the books among the students such that the student who gets the most pages gets the minimum possible pages (fair allocation).

**Q8.** You are given a 2D matrix where every row and column is sorted. Search for a target number efficiently.

### Hard
**Q9.** You are given two sorted arrays. Find the median of their combined elements (without merging the two arrays, in O(log n) time).

**Q10.** You are given n ropes/logs of different lengths. Decide a height at which to cut all the ropes so that the total cut-off length is at least some required amount, while minimizing that height (similar to the "Koko eating bananas" type problem — minimize the maximum / minimize the rate).

---

## 7. Monotonic Stack

Using a stack to solve "next greater/smaller element" type problems.

### Easy
**Q1.** You are given an array. For every element, find the first greater element to its right.

**Q2.** You are given an array. For every element, find the first smaller element to its right.

**Q3.** You are given an array. For every element, find the first greater element to its left.

**Q4.** You are given an array of daily temperatures. For each day, find how many days you'd have to wait for a warmer temperature.

### Medium
**Q5.** You are given a circular array. For every element, find the first greater element to its right (since the array is circular, wrap around from the end back to the start if needed).

**Q6.** You are given an array of stock prices. For each day, find its "span" — the number of consecutive previous days where the price was less than or equal to today's price.

**Q7.** You are given a histogram (an array of bar heights). Find the largest rectangle that can fit inside the histogram.

**Q8.** You are given a string containing brackets ((), [], {}). Check whether the brackets are properly balanced or not.

### Hard
**Q9.** You are given a 2D binary matrix (0s and 1s). Find the largest rectangle that contains only 1s.

**Q10.** You are given a string. Create the smallest possible subsequence (lexicographically) that has no duplicate characters and maintains the original relative order (similar to the "remove duplicate letters" problem, solved using a monotonic stack).

---

## 8. Fast & Slow Pointers (Cycle Detection)

Using two pointers moving at different speeds to detect cycles or find the middle element, mostly used in linked lists.

### Easy
**Q1.** You are given a linked list. Find its middle node.

**Q2.** You are given a linked list. Check whether it has a cycle (loop) or not.

**Q3.** You are given a linked list. Check whether it is a palindrome or not.

**Q4.** You are given an array containing numbers from 1 to n (one number is duplicated). Find that duplicate number using Floyd's cycle detection, without modifying the array.

### Medium
**Q5.** You are given a linked list that contains a cycle. Find the point where the cycle begins.

**Q6.** You are given a linked list. Find the kth node from the end (in a single pass, without traversing twice).

**Q7.** You are given two linked lists that intersect (merge) at some point. Find that intersection point.

**Q8.** You are given a linked list. Reorder it in this pattern: first node, last node, second node, second-last node, and so on.

### Hard
**Q9.** You are given an array of numbers (which may contain duplicates). Check whether the array contains a cycle when each element is treated as a "next index" (similar to the circular array loop problem).

**Q10.** Check if a number is a "happy number" — repeatedly replace the number with the sum of the squares of its digits; check whether it eventually reaches 1 or gets stuck in an infinite loop (using cycle detection).

---

## 9. Hashing (HashMap / HashSet based)

Using a HashMap or HashSet for fast lookups, frequency counting, and duplicate-checking problems.

### Easy
**Q1.** You are given an array. Check whether it contains any duplicate element.

**Q2.** You are given an array and a target sum. Find two numbers whose sum equals the target (using a HashMap, in O(n) time).

**Q3.** You are given an array. Count the frequency (how many times each element appears).

**Q4.** You are given two arrays. Find the common elements (intersection) between them.

### Medium
**Q5.** You are given a string. Find its first non-repeating character.

**Q6.** You are given an array of strings. Group the strings that are anagrams of each other.

**Q7.** You are given an array and a number k. Check whether there are two indices in the array with equal values such that the distance between them is less than or equal to k.

**Q8.** You are given an array. Find the length of the longest consecutive sequence (for example, if the array contains 1, 2, 3, 4 in any order, the length is 4) — solve it in O(n) time.

### Hard
**Q9.** You are given an array and a number k. Count how many subarrays have a sum exactly equal to k (combine prefix sum with a HashMap).

**Q10.** You are given a list of n employees along with their friends (connections). Using a HashMap/HashSet, check whether two employees are connected (directly or indirectly), and find the connection path between them.

---

## 10. Recursion & Backtracking

Breaking a problem down into smaller sub-problems, and in backtracking, trying out all possibilities and undoing choices when needed.

### Easy
**Q1.** You are given a number. Find its factorial using recursion.

**Q2.** You are given an array. Find its sum using recursion.

**Q3.** You are given a string. Reverse it using recursion.

**Q4.** You are given two numbers (base and power). Calculate the power using recursion.

### Medium
**Q5.** You are given an array of distinct numbers. Find all of its subsets (power set).

**Q6.** You are given a string. Find all possible permutations of its characters.

**Q7.** You are given a number n. Generate all valid combinations of balanced parentheses using n pairs.

**Q8.** You are given an array of numbers and a target. Find all unique combinations whose sum equals the target (a number can be used multiple times).

### Hard
**Q9.** You are given an N x N chessboard. Place N queens such that no two queens attack each other — find all possible arrangements.

**Q10.** You are given a 2D grid (word search puzzle) and a word. Check whether the word exists in the grid (by connecting adjacent cells, where each cell can only be used once).

---

**Total: 100 questions across 10 patterns.**
