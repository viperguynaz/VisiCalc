VisiCalc CP2 - Fri 1/9
==============

## Objectives
- Understand how to create classes from an abstract class and then use those classes

## Assignment
- Complete class Spreadsheet - the main program (as written) should produce the following:

## Output
```
            |     A      |     B      |     C      |     D      |     E      |     F      |     G      |
------------+------------+------------+------------+------------+------------+------------+------------+
     1      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     2      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     3      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     4      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     5      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     6      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     7      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     8      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     9      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     10     |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+


            |     A      |     B      |     C      |     D      |     E      |     F      |     G      |
------------+------------+------------+------------+------------+------------+------------+------------+
     1      |    wow     |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     2      |            |  quot"es   |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     3      | 01/01/1990 |            |wow this is>|            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     4      |            | 12/25/2014 |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     5      |            |            |            |            |   105.12   |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     6      |            |            |            |            |            |3.141592653>|            |
------------+------------+------------+------------+------------+------------+------------+------------+
     7      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     8      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     9      |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+
     10     |            |            |            |            |            |            |            |
------------+------------+------------+------------+------------+------------+------------+------------+

A1 = "wow"
B2 = "quot"es"
C3 = "wow this is a long string"
D4 = <empty>
E5 = 105.12
F6 = 3.14159265359
G7 = <empty>
A3 = 01/01/1990
B4 = 12/25/2014

```

VisiCalc - Thur 12/18
==============

Create a program that prints different cell values representing cells in a spreadsheet

## Objectives
- Understand polymorphism and inheritance and how the same code can be used with several different types of objects and behave differently depending on the actual type of object used
- Implement a superclass and three subclasses that inherit from the superclass
- Create a main program to test the classes

## Assignment

### class Cell (Cell.java)
- Field: 
  - value
- Constructors:
  - Default (no parameters)
  - Second: takes one parameter and assigns it to value
- Accessors:
  - getValue()
  - toDisplay()
  - toString()
- Mutators:
  - setValue(??? input)
  
### class CellNumeric that inherits Cell (CellNumeric.java)
- Fields: none
- Constructors:
  - Default (no parameters)
  - Second: takes one parameter and assigns it to value - HINT: use setValue()
- Accessors:
  - value()
- Mutators:
  - setValue(??? input)
    
### class CellDate that inherits Cell (CellDate.java)
- Fields:
  - dateFormat (HINT: DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
- Constructors:
  - Default (no parameters)
  - Second: takes one parameter and assigns it to value - HINT: use setValue()
- Accessors:
  - value(): returns the wage of the employee
- Mutators:
  - setValue(??? input)
  
  
### class CellString that inherits Cell (CellString.java)
- Fields: none
- Constructors:
  - Default (no parameters)
  - Second: takes one parameter and assigns it to value - HINT: use setValue()
- Accessors:
  - value()
- Mutators:
  - setValue(??? input)
  
### CREATE main program OrgChart
main method should exercise your class methods:
- create an array of 12 cells
- initialize the array
- add test values to match the 12 values below
- print out the array formatted as below:

```
    row     |   output   |   input   
------------|------------|------------
     1      |            | <empty>
------------|------------|------------
     2      |    wow     | "wow"
------------|------------|------------
     3      |  quot"es   | "quot"es"
------------|------------|------------
     4      |wow this is>| "wow this is a long string"
------------|------------|------------
     5      |            | <empty>
------------|------------|------------
     6      |            | <empty>
------------|------------|------------
     7      |   105.12   | 105.12
------------|------------|------------
     8      |3.141592653>| 3.14159265359
------------|------------|------------
     9      |            | <empty>
------------|------------|------------
     10     |            | <empty>
------------|------------|------------
     11     | 01/01/1990 | 01/01/1990
------------|------------|------------
     12     | 12/25/2014 | 12/25/2014
------------|------------|------------
```
