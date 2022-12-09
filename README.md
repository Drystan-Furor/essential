# essential Devloper Courses

java_basics

1. Java Essential Training: Syntax and Structure
   # gross_calculator
   ## calculate an employee's Gross Pay
    1. Get the number of hours worked.
    2. Get the hourly pay rate.
    3. Multiply hours by pay rate.
    4. Display results.

|  Name   | Default |  Size  |      Type      |      Example      |
|:-------:|:-------:|:------:|:--------------:|:-----------------:|
|  byte   |    0    | 8-bit  |    Integral    |   byte b = 100;   |
|  short  |    0    | 16-bit |    Integral    | short s = 10000;  |
|   int   |    0    | 32-bit |    Integral    |  int i = 100000;  |
|  long   |   0L    | 64-bit |    Integral    | long I = 9999999; |
|  float  |  O.Of   | 32-bit | Floating point | float f = 123.4f; |
| double  |  0.0d   | 64-bit | Floating point | double d = 12.4 ; |
| boolean |  FALSE  | 1-bit  |    Boolean     | boolean b = true; |
|  char   | '\u000' | 16-bit |   Character    |   char c ='C';    |


> While Java is a statically typed language, it offers type inference for local variables, which means we can declare a variable as VAR and Java will infer the data type based on what is assigned to the variable. Let's take a look at an example. As opposed to using boolean as the data type for the variable isWaterWet, we can use the word VAR. When using VAR, you must initialize the variable at the time of declaration. Otherwise, Java is unable to infer what the data type should actually be. Type inferences only allows for local variables. Local variables are variables that are declared within a method. You cannot use VAR for declaring a global variable, which is a variable that is defined at the class level outside of the methods of the class.
## Local variable type inference
````
    public static void main(String[] args){
        var isWaterWet = true;
   }
````
- Please be descriptive when you're naming your variables, methods, class, and packages. Anything that you name in programming, be descriptive of what it represents.

