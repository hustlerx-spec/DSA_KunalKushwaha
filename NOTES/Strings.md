Strings are a sequence of characters

a.String Pool
b.Immutability

String objects are stored inside a string pool inside the heap memory
String pool is alos a form of memory

String objects are immutable i.e. they cant be changed once created.

// Create diff objects of same value

String name2=new String("Devid");
String name1=new String("Devid");
(both these objects are created in the heap outside the string pool)

The System.out,println is a builtin java function that calls the valueof function and the value of function calls the toString function, basically every output printed by this function is a string. 

For adding two complex objects atleast one string must be present in the expression even though if its an empty string.

"+"operator used for concatenation is opeartor overloading. 
 Operator overloading is not supported in JAVA, supported in c++, python.
java separately writes for  + operator overloading.

Always use .equals() method for comparing two strings instead of == .
  == compares memory references and equals compares values.