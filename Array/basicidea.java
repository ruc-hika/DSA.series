Arrays — Basic Notes
1. What is an Array?

An array is a collection of elements of the same data type stored in a fixed-size structure.

int[] arr = {10, 20, 30, 40, 50};

Here:

arr → array name
int → data type
5 → size
Index starts from 0
Index:   0   1   2   3   4
Value:  10  20  30  40  50
2. Creating an Array
Declaration
int[] arr;
Creation
arr = new int[5];
Declaration + Creation
int[] arr = new int[5];
Initialization
int[] arr = {10, 20, 30, 40, 50};
3. Accessing Elements

Use the index.

int[] arr = {10, 20, 30, 40, 50};

System.out.println(arr[0]);  // 10
System.out.println(arr[2]);  // 30
System.out.println(arr[4]);  // 50
Important
First element  → arr[0]
Last element   → arr[n - 1]
4. Updating an Element
int[] arr = {10, 20, 30, 40};

arr[2] = 100;

System.out.println(arr[2]);

Output:

100

Array becomes:

10 20 100 40
5. Traversing an Array
Using for loop
int[] arr = {10, 20, 30, 40, 50};

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
Using enhanced for loop
for (int x : arr) {
    System.out.println(x);
}
6. Array Length

Use:

arr.length

Example:

int[] arr = {10, 20, 30, 40};

System.out.println(arr.length);

Output:

4

⚠️ length is a property, not a method.

arr.length      // correct
arr.length()    // wrong
7. Basic Array Operations
Find Sum
int sum = 0;

for (int x : arr) {
    sum += x;
}

System.out.println(sum);
Find Maximum
int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}

System.out.println(max);
Find Minimum
int min = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
}

System.out.println(min);
8. Searching
Linear Search

Check every element one by one.

int target = 30;
int index = -1;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        index = i;
        break;
    }
}

System.out.println(index);
Time Complexity
Best Case  → O(1)
Worst Case → O(n)
9. Reverse an Array

Use two pointers:

left →              ← right
10  20  30  40  50
int left = 0;
int right = arr.length - 1;

while (left < right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    left++;
    right--;
}

Result:

50 40 30 20 10
10. Important Array Patterns

These are the patterns you should learn after the basics:

1. Traversal
2. Linear Search
3. Two Pointers
4. Sliding Window
5. Prefix Sum
6. Kadane's Algorithm
7. Binary Search
8. Sorting
9. HashMap + Array
10. Frequency Array
11. Difference Array
12. Monotonic Stack
13. Heap / Priority Queue
14. Intervals
15. Dynamic Programming on Arrays
11. Time Complexity
Operation	Complexity
Access	O(1)
Update	O(1)
Linear Search	O(n)
Insert at end*	O(1)
Insert at beginning	O(n)
Delete from beginning	O(n)

* For a fixed Java array, you cannot actually resize it; this assumes there is available space in a conceptual array structure.

12. Important Java Syntax
// Create
int[] arr = new int[5];

// Initialize
int[] arr = {1, 2, 3, 4, 5};

// Access
arr[0];

// Update
arr[2] = 10;

// Length
arr.length;

// Loop
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
13. Basic Questions to Practice

Start with these before moving to hard array problems:

Find maximum element
Find minimum element
Find sum of elements
Find average
Linear search
Count even and odd numbers
Count positive and negative numbers
Reverse an array
Check if array is sorted
Find second largest element
Remove duplicates from sorted array
Move zeroes to the end
Left rotate array
Right rotate array
Find frequency of each element
