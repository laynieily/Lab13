[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18403580)
# Lab Assignment 13

In this lab you will practice working with functions.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

Create your new functions **outside the main() method, but inside your class**.

Now let's begin!

### Functions

Functions in Java have a similar syntax as functions in C++, except Java requires you to include the `static` keyword at the beginning. We will discuss why later.

A function is a block of code which only runs when it is called. You can also send and receive data to and from a method.

In Java, **functions must be declared inside a class**. Functions declared inside of a class are called **Methods**.

For more information about methods in Java visit: https://www.w3schools.com/java/java_methods.asp or https://www.programiz.com/java-programming/methods

### Parameters

Parameters are **variables declared inside the method's** `( )` and are used to receive and store data sent to the method.

**Example:**

```java
static void main(String[] args) {
	// Sending data in method call.
	myFunction( 2, 3.21f, "abc" );
}
// Parameters will receive:  2    ,    3.21f    ,     "abc"
static void my_function( int param1, float param2, String param3 ) { /**/ }
```

For more information on parameters in Java visit: https://www.w3schools.com/java/java_methods_param.asp

### Returning Values

In order to send data from a method you have to specify what value will be returned in its prefix. 

**Non-value returning methods** have prefix `void`. 

**Value-returning methods** have the prefix of the values type: `int`, `float`, `String`, etc. and require the `return` keyword somewhere inside its `{ }`. 

```java
// Returning a String value
static String my_str_function() { return "abc"; }
// Returning an Integer value
static int my_int_function() { return 0; }
```

For more information on returning values in Java visit: https://www.w3schools.com/java/java_methods_return.asp

## Your Assignment

### Simple Math

Create the following **4 functions** to practice working with functions and function parameters.

Make sure all functions are **static**.

- `greet()` method should simply output "Hello World!".

- `sum(x, y)` method should receive two double values and return their sum.

- `even(x)` method should receive one integer value and return true if it's even or false if it's odd.

- `max( []x )` method should receive an integer array and return the largest value.

**Test Your Code:**

Unlike previous labs, this lab includes test cases. Run the following command in your terminal to test your code:

```
./test.sh
```

## Submit your assignment

[Grading Criteria](https://joselitoguardado.dev/3326/labs/Lab_13.pdf)

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
