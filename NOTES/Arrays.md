1.Array objects are in heap
2.Contains elements of similar datatype.
3.int[] ros; // declaration of array, rps is getting defined in stack.
4.ros=new int[5]; //initialization  //actually object is created in heap.
5. initialization happens at compile time and object creation at run time i.e. dynamic memory allocation.

Heap objects are not continuous.
Hence array objects in java may not be continuous.(depends on JVM)
New keyword is used to create objects.
For an empty int array all values will be 0 by default
Note- Null cant be assigned to any primitives, can only be assigned to non primitives.
Null is a by default value of what reference variables point to.


Note- For primitive type arrays the array object stores the values itself .
For object type,each array element is an object itself.
Object arrays store reference to objects.
The objects can be stored anywhere in the memory(heap).