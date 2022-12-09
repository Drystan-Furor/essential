# essential Devloper Courses

java_basics

1. Java Essential Training: Syntax and Structure
   # gross_calculator
   ## calculate an employee's Gross Pay
    1. Get the number of hours worked.
    2. Get the hourly pay rate.
    3. Multiply hours by pay rate.
    4. Display results.

## Type definitions in Java

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

***
> While Java is a statically typed language, it offers type inference for local variables, which means we can declare a
> variable as VAR and Java will infer the data type based on what is assigned to the variable. Let's take a look at an
> example. As opposed to using boolean as the data type for the variable isWaterWet, we can use the word VAR. When using
> VAR, you must initialize the variable at the time of declaration. Otherwise, Java is unable to infer what the data
> type should actually be.

> Type inferences only allows for local variables. Local variables are variables that are declared
> within a method. You cannot use VAR for declaring a global variable, which is a variable that is defined at the class
> level outside of the methods of the class.

## Local variable type inference

````
    public static void main(String[] args){
        var isWaterWet = true;
   }
````

- Be descriptive when you're naming your variables, methods, class, and packages.
- Anything that you name in programming, be descriptive of what it represents.

***

## Arithmetic Operators

| Operator |                             Description                             | Example |
|:--------:|:-------------------------------------------------------------------:|:-------:|
|    +     |                       Adds two numeric values                       |  a + b  |
|    -     |              Subtracts one numeric value from another               |  a - b  |
|    *     |                    Multiplies two numeric values                    |  a * b  |
|    /     |                Divides one numeric value by another                 |  a / b  |
|    %     | Returns the remainder of dividing <br> one numeric value by another |  a % b  |

***

# CHAHLLENGE:

## create a fill-in-the-blanks story program

On a `adjective` `season` day,
I drink a minimum of `number` cups
of coffee.
***

# If statements

> Oftentimes programs have to make decisions. So we need to provide different paths of execution within our code. To do
> this, we use what's called decision structures. The If statement is the most common decision structure in programming.
> It works as a quick detour within the program. If a certain situation occurs, the program executes a specified block
> of
> code and then returns to the main path of execution

```mermaid
gitGraph:
       commit "program"
       branch choice
	   		checkout choice
       commit
	   	 checkout master
	   	 commit
	    merge choice
```

***

# Challenge: Change for a dollar game

> The objective of the game is to enter enough change to equal exactly one U.S. dollar. Feel free to change this game for
> your country's currency. It still works. Create a program that asks the user to enter the quantities of the following
> coins. You'll ask them how many pennies they would like, how many nickels, how many dimes, and how many quarters. Then,
> your program is going to count the value of all of the change that they suggested. If the change equals exactly one U.S.
> dollar, then they win the game. If it's more than one U.S. dollar, then tell them that it's more than $1 and how much
> they went over. If it's less than one U.S. dollar, tell them how much they went under.