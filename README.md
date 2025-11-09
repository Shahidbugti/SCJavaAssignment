Software Construction Assignment (Java)

This repository contains my Software Construction Assignment which includes 4 Java programs (Figures 1–4).
Each figure shows a different software design principle that we discussed in class.
I wrote and tested everything using VS Code.

Figure 1 – Interface Segregation Principle

In this program, I created different small interfaces instead of one big one.
Amazon implements all three (hosting, CDN, and storage), while Dropbox only implements storage.
This helps keep the code clean and each class only depends on what it really needs.

Figure 2 – Composition Example

Here, the Transport class is made by combining an Engine and a Driver.
Different engines (like Electric or Combustion) and drivers (Human or Robot) can work together.
It shows how composition gives flexibility — I can swap parts without touching the main class.

Figure 3 – Factory Method Pattern

In this example, the Company class defines a process to make software,
but each company type (GameDevCompany or OutsourcingCompany) creates its own team of employees.
This follows the Factory Method Pattern, where object creation is handled by subclasses.

Figure 4 – Open/Closed Principle

In this figure, the Order class uses a Shipping interface.
Different shipping types like Ground or Air can be used, and I can add more later
without changing the Order class.
This follows the Open/Closed Principle — open for extension but closed for modification.

How to Run

Each figure is a separate file in the Figures package.
You can run them one by one using the commands below:

javac Figures/Fig1.java
java Figures.Fig1

javac Figures/Fig2.java
java Figures.Fig2

javac Figures/Fig3.java
java Figures.Fig3

javac Figures/Fig4.java
java Figures.Fig4

About This Project

This assignment helped me understand how design principles work in real examples.
I learned how to write cleaner, more flexible code using interfaces, composition, and patterns.
Each figure builds a small but meaningful concept from object-oriented design.
