## Object-oriented Programming 08: Java Arrays
> Created by Anita Nursi &nbsp;&middot;&nbsp;
> Student ID Number: 21343018 &nbsp;&middot;&nbsp;
> Majority of Informatics &nbsp;&middot;&nbsp;
> Faculcity of Engineering &nbsp;&middot;&nbsp;
> Universitas Negeri Padang
---
# About
This is a learning project about Arrays in Java. Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class depending on the definition of the array. In the case of primitive data types, the actual values are stored in contiguous memory locations. In the case of class objects, the actual objects are stored in a heap segment. 

![image](https://user-images.githubusercontent.com/112265105/194708994-4277d2e3-b125-40e4-bf08-b4b20e5ee4fa.png)

To declare an array, define the variable type with square brackets:
```
String[] cars;
```
We have now declared a variable that holds an array of strings. To insert values to it, we can place the values in a comma-separated list, inside curly braces:
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```
To create an array of integers, you could write:
```
int[] myNum = {10, 20, 30, 40};
```
---
# #1 Access the Elements of an Array
We can access an array element by referring to the index number.

This statement accesses the value of the first element in cars:
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```
---

# #2 Change an Array Element
To change the value of a specific element, refer to the index number:
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
```
---

# #3 Array Length
To find out how many elements an array has, use the length property:
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4
// Now outputs Opel instead of Volvo
```
---

### Source
> https://www.w3schools.com/java/java_arrays.asp <br>
> https://www.geeksforgeeks.org/arrays-in-java/
---
