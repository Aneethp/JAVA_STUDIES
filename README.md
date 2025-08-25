# JAVA_STUDIES

****1. Introduction****
**01. Introduction:**
Java is a high-level, object-oriented programming language that was first released by Sun Microsystems in 1995 (now owned by Oracle).
Included Topics:
1. Why you must learn java
2. what is a programming language
3. what is algorithim
4. what is syntax
5. History of java
6. Magic of byte code
7. how java changed the internet
8. Java buzzwords
9. Object oriented programming
    


**1. Why you must learn Java**
Stable and Future-Proof:
Java has been around since 1995 and is still evolving.
Many critical systems depend on Java — they won’t disappear anytime soon.
 Good for Career Switching:
If you want to become a backend developer, mobile developer (Android), or cloud engineer, Java is a strong choice.
 Widely Used in the Real World:
Java is everywhere: Android apps, banking systems, e-commerce platforms, enterprise software, cloud computing, IoT.Big companies like Google, Amazon, Netflix, and banks still heavily use Java.
In points:
1. One of the most popular language. java currently runs on 60,00,00,00,000 devices.
2. wide usage(web-apps,backend,mobile apps, enterprise software)
3. highly paying and a lots of jobs
4. Object oriented
5. Rich APIs and community support

1.2 What is programming language?
>Giving instruction to a computer
>Instructions: Tells computer to what to do.
>There instruction are called code.
>Human instructions are given in High level language
Compiler converts high level language to a low level languages or machine codes.

1.3 What is an algorithm?
An algorithm is a step-by step procedure for solving a proble, or performing a task.

1.4 what is syntax?
> Structure of words in a sentence.
> Rules of the language.
> For programming exact syntax must be followed.

1.5 history of java
Developed by James Gosling at sun Microsystem (Early 1990s).
Originally named 'Oak', later renamed java in 1995.
First Realese(1995):Introduced "Write once,Run anywhere" concept with cross-platform compatibility.
Developed with vision of backward compatibility. should not break with new version release.
<img width="1437" height="807" alt="image" src="https://github.com/user-attachments/assets/14f621ae-c87f-49eb-bc11-d248d5c016a4" />

1.6 Magic of bytecode
<img width="1134" height="608" alt="image" src="https://github.com/user-attachments/assets/29d771aa-a7e3-4f2c-a521-805b87968bcb" />

1.7 How Java Changed the internet
> Portability with write once and run anywhere
> Security because of the code running on virtual machine

1.8 java buzzwords
>Robust: Java is robust due to its strong memory management, exception handling and type checking mechanisms, whic helps in preventong system crashing and ensuring reliabile preformance.
>Multithreaded: Multithreading in programming is the ability of a CPU to execute multiple threads concurrently, allowing for more efficient processing and task management.























**03. What is the programming language**
A programming language is a set of instructions and rules that you can use to tell a computer what to do.
Think of it like this:
You speak English or Japanese to communicate with people.
You use a programming language to communicate with a computer.

💡 Simple analogy:
If a computer is like a robot, then a programming language is the recipe book that tells the robot exactly what steps to follow.


**04.What is an algorithm**
An algorithm is a step-by-step set of instructions for solving a problem or performing a task.
It’s like a recipe in cooking — it tells you exactly what to do, in what order, to get the desired result.
Key points:
> Purpose – To solve a problem efficiently.
> Characteristics –
     Clear: Each step is unambiguous.
     Finite: Has a definite beginning and end.
     Effective: Solves the problem within a reasonable time.
> Examples in daily life –
     Following steps to make tea.
     Sorting names in alphabetical order.
     Navigating from home to work using Google Maps.

Example in programming (finding the largest number in a list):
> Start.
> Assume the first number is the largest.
> Compare it with the next number.
> If the next number is larger, make it the new largest.
> Repeat until all numbers are checked.
> Output the largest number.
> Stop.

💡 In short:
Programming language = the tool to tell a computer what to do.
Algorithm = the plan or strategy for how to do it.


**04. What is syntax**
Syntax in programming is the set of rules that define how you must write code so that the computer can understand it.
It’s like grammar in a human language — if you break grammar rules, people may not understand you; if you break syntax rules, the computer will throw an error.

Key points:
> Purpose – Ensures the code is structured correctly so it can be compiled or interpreted.
> Examples in Java syntax –
    Statements must end with a semicolon (;).
    Curly braces { } define the start and end of a block.
    Keywords (like class, public, if) must be lowercase.


**05. Magic of bytecode**
1. What is Bytecode?
Bytecode is a special, intermediate code generated by the Java Compiler (javac) when you compile your .java file.
It’s not plain text (Java source code) and not pure machine code — it’s a set of instructions for the Java Virtual Machine (JVM).
Bytecode files have the extension .class.

2. Why is Bytecode Magical?
> Platform Independent:
 You write Java code once → compile it into bytecode → that bytecode can run on any device with a JVM (Windows, Mac, Linux, Android, etc.).
> Portable:
 No need to rewrite code for different systems — the JVM adapts it to the machine’s CPU and OS.
> Secure & Managed:
 JVM checks bytecode for security and memory safety before running it.
> Optimized Execution:
 JVM uses Just-In-Time (JIT) compilation to turn bytecode into native machine code at runtime, making it fast.


3. Java Program Execution Flow
Write Java source code (.java).
Compile with javac → creates bytecode (.class).
Run the bytecode using the JVM → JVM translates it to machine code for your OS.


**06. Object Oriented Programming**
Object-Oriented Programming (OOP) is a way of designing and writing programs by organizing code into objects that represent real-world things or concepts.
Java is a fully object-oriented language (except for its primitive data types), which means OOP is at its core.
1. Key Idea:
Instead of writing code as one long list of instructions, you break it into objects that have:
 >Attributes (data, called fields or variables)
 >Behaviors (functions, called methods)
Example:
Object: Car
      -Attributes: color, model, speed
      -Behaviors: start(), stop(), accelerate()

2. Main Principles of OOP
a) Encapsulation
> Keeping data (variables) and methods (functions) together inside one unit (class).
> Restricting access to some parts of the object using access modifiers (private, public).
> Example: You can’t directly change a car’s engine from outside — you use methods like startEngine().

b) Inheritance
> One class can inherit the properties and methods of another class.
> Helps in code reuse.
> Example:
      Vehicle (parent class)
      Car and Bike (child classes that inherit from Vehicle)

c) Polymorphism
> One name, many forms — a method can behave differently depending on the object calling it.
> Example:
      draw() method could draw a circle, rectangle, or triangle depending on the shape object.

d) Abstraction
> Hiding unnecessary details and showing only the important features.
> Example: You drive a car without knowing the exact internal engine mechanics — you just use accelerate() and brake().

3. Benefits of OOP
> Reusability (use existing code for new programs)
> Maintainability (easy to update or fix)
> Scalability (easy to add new features)
> Better organization of code


** 07. Programming Challenge 1-3**
1. Create a class to output "good morning" and check the output.
2. Create a new project and output "Hello there" on the console.
3. Show the following pattern.
   *          * * * *           *
   * *        * * *           * *
   * * *      * *           * * *
   * * * *    *           * * * *



































