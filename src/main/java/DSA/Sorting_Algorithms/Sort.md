   Bubble Sort..
   
  a) also known as sinking or exchange sort, compares element with element at right, 
  and swaps if found smaller element at right.
  b) time comolexity : best case : O(N)
   worst case: O(N^2)
  c)Space complexity : O(1)
d) it is a stable sorting algorithm


Selection Sort..

a) find maximum element in every pass and puts it at its position.

b) time complexity : best case : O(N^2)
worst case: O(N^2)
c) it is not a stable sorting algorithm, and it performs well on small lists.


Insertion sort
a) time complexity: best case:O(N)
   worst case:O(N^2)
b) stable sorting algorithm
c) adaptive: steps get reduced if array is already sorted, as compared tp bubble sort.
d) It is used for smaller values of N=> works good when array is partially sorted( that is th reason it is used in
hybrid sorting algorithms.)


Cyclic sort       ( very very very very very imp)
=> whenever given numbers from range 1 to N : use cyclic sort
b)time complexity: O(N)
   in worst case it will make 2N-1 swaps.
Note: in cycle sort i must always go till i<arr.length(all positions must be iterated from start till end)
