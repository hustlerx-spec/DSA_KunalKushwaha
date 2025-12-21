Are used when we want to pass elements inside without size constraint.
here we cant pass primitives we have to pass the wrapper classes in datatype.



// Internal Working
-> SAme as array.

How are we able to pass input more than size,or no size is required. why size not fixed??

1. Size is fixed internally
2. Once list is filled with a certain amount it creates a new list double the size of list for how many indexes it is filled,
copy the elements from old list and deletes old list and this goes on...
3. amortilized time complexity of O(n).


