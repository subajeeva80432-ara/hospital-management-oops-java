📖 Overview

This project demonstrates Object-Oriented Programming concepts by modeling a simple Hospital Management System.

The system includes:

Doctor

Patient

Both extend a common base class Person.

🎯 Objective

To demonstrate:

Inheritance

Polymorphism

Method Overriding

Code Reusability

using real-world hospital roles.

🏗️ OOPS Concepts Used
1️⃣ Inheritance

Doctor and Patient extend the Person class.

2️⃣ Method Overriding

Both child classes override showDetails() method.

3️⃣ Polymorphism

Parent reference is used:

Person p1 = new Doctor(...);
Person p2 = new Patient(...);

Dynamic method dispatch occurs at runtime.

💻 Project Structure
Person (Base Class)
   |
   |-- Doctor
   |
   |-- Patient

Main Class
▶️ Sample Output
Name : Dr. Kumar
ID   : 101
Specialization : Cardiology
Role : Doctor - Provides treatment

Name : Anitha
ID   : 201
Disease : Fever
Role : Patient - Receiving treatment
📚 Key Learning

Role-based modeling using inheritance

Runtime method resolution

Practical understanding of OOPS concepts

👩‍💻 Author

Subasri A
B.E CSE (Cyber Security)
OOPS Lab Project# hospital-management-oops-java
A simple Java-based Hospital Management System demonstrating Inheritance and Polymorphism with Doctor and Patient roles.
