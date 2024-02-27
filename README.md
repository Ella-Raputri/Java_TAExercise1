# TA L2AC Week 4 Exercise 01 Part 2 Programming

**Name:** Ella Raputri

**Class:** L2AC

**Student ID:** 2702298154

<br>

## Description
TA Week 4 Exercise 01 is an exercise assigned by L2AC TA 2024, Edward Alvin to test our understanding of Java's OOP principles, including Inheritance, Encapsulation, Abstraction, and Polymorphism. This repository contains source codes to answer part 2 of the exercise that is given by the TA, which is the programming part. The parent class has to be the Animal class and we are free to choose the child class(es). For this exercise, I have chosen the Cat and Bird classes as the child classes. 

<br>

## Code Files
- Animal.java, contains the Animal class which is an abstract parent class, so it can't be instantiated as an object.
- Bird.java, contains the Bird class that inherits from the Animal class and contains implementation for the abstract methods in the parent class.
- Cat.java, contains the Cat class that inherits from the Animal class and contains implementation for the abstract methods in the parent class. There are several attributes that are different between the Bird and Cat classes.
- Main.java, is the driver file to test all the methods that have been implemented in Animal, Bird, and Cat classes.

<br>

## 3 OOP Principles Implementation
- **Inheritance** <br>
The concept of inheritance can be seen in this where the Bird and Cat classes inherit from the parent class Animal, so the Bird and Cat classes have the attributes and methods that the Animal class has. In other words, the Animal class is the superclass, while the Bird class and Cat class are the subclasses of the Animal class.

- **Encapsulation** <br>
The concept of encapsulation is similar in meaning to enclosing something in a capsule so that other people can't access it. In this case (in OOP), encapsulation is related to the access modifiers that are given to the attributes of a class. In this code, we can see that the attributes name, weight, total_legs, and move_method are set to be private. In this way, another file (the driver) and the subclasses can't access it directly. We have to use the getters to access those attributes. This is the concept of encapsulation that is implemented in this code.

- **Abstraction** <br>
The principle of abstraction is to hide certain details (the implementation). Abstraction can be achieved through using the abstract class or interfaces. In this code, I have used the abstract class. The Animal (parent class) is an abstract class, so it can't be instantiated as an object. There are also abstract methods in the Animal class, which are moving() and animalSound(). The implementations of both of them have to be specified in the subclasses as it is an abstract method. I have also implemented a little polymorphism here because I override the moving() and animalSound() methods in the Cat and Bird classes, so that although they have the same name, the implementation is somewhat different. 





<br>
