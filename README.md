# PROBLEM STATEMENT

**Iteration 1 :**

The Queen of England is hosting a big birthday party for which a set of records have been generated. The Royal Family has approached you in helping with their software requirements. As of now, their first requirement is to help print labels that will go on the invitation covers.

The family has furnished you a list of records in the following format:
firstName,lastName,gender,age,city,state,country

The family is as yet undecided on how to address their guests. They are thinking of one of two options:

Mr John Doe
Ms Jane Smith

or 

Mr Doe, John
Ms Smith, Jane

The assumption is that all males are prefixed with Mr and all females are prefixed with Ms.

Your task is to write a library that will allow for these features. Given a record, I should be able to get a representation of that record that can go on an invitation cover.

**Iteration 2 :**

The Royal Family has decided that they also need to prioritise their invitations and would only like to focus on invitees from specific countries.They would like you to only furnish them label options for people from a specific country.

For ex, invitees from Bangladesh:

Mr John Smith, Bangladesh
Ms Jane Doe, Bangladesh

or

Mr Smith, John, Bangladesh
Ms Doe, Jane, Bangladesh

The Royal Family is still unsure about which method of greeting they would like to go with. So they would like to see both forms of greeting for all invitees from a specific country.

**Iteration 3 :**

The Royal Family has decided that alcohol will be served at the birthday party. In order to ensure the legality of the proceedings, they have decided to dispense vouchers to all invitees above the age of 20.
 
This means that your software has to have the ability to filter people above a certain age.

Of course, the Royal Family also wishes to be able to apply multiple filters at the same time. Meaning, they would like to see all people of legal drinking age from a specific country.

The filtered results, as before, can be viewed with formal or informal addressing.

Ex:

Mr John Smith, Bangladesh, 20
Ms Jane Doe, Bangladesh, 30

or 

Mr Smith, John, Bangladesh, 20
Ms Doe, Jane, Bangladesh, 30

**PS - trunk based development was followed with proper TDD approach. And was hosting this project on gitlab but in the end migrated here on Github.**


# What the company is looking for or what are the company's expectations?

They are looking for people who can write code that has flexibility built-in, by adhering to the principles of Object-Oriented Development, and have the ability to deal with the real-life constraints/trade-offs while designing a system.

It is important to note that they are not looking for a GUI and they are not assessing you on the capabilities around code required to do the I/O. The focus is on the overall design. So, while building a solution, it would be nicer (not mandatory) if the input to the code is provided either via unit tests or a file. Using a command-line (for input) can be tedious and difficult to test, so it is best avoided (again not mandatory). Following is a list of things to keep in mind, before you submit your code for any LLD/OOD/OOPs round:

1. Clear identification of domain entities or classes and their relations with appropriate object modeling using composition.

2. Functionality should not be dumped in a single class, method, or file (don't create God class).

3. Write a clean Code with clear intention so as to have good readability (Proper Naming Conventions, Self-documenting code, Avoid redundant commenting, etc).

3. Clear and logical separation of responsibilities with proper boundaries (emphasis on single responsibility (SRP) for high cohesion).

4. Have you applied the principles of YAGNI and KISS?

5. Have you applied SOLID principles to your code?

6. Is the behavior of an object distinguished from its state and is the state encapsulated? 

7. Have you looked at basic refactoring to improve the design of your code?

8. Are the principles applied in a pragmatic way.

9. Code should be easily extensible & maintainable

11. Atomicity and Coverage of Unit Tests.

**Simplicity is the strongest trait of a piece of code. However, easily written code may not necessarily be simple code.**


# Why LLD/OOD/OOPs in software engineering interviews?

So main reason behind asking this kind of problems in an interview is to see whether a candidate can do the following:

1. Can a candidate write a working code in a given short span of time? So as to measure his/her delivery capability?

2. Can a candidate write highly readable, maintainable & extensible code? The intention must be clear by reading the code (Check 4 rules of simple design)

3. Can a candidate follow the principle of DRY (Don't Repeat Yourself) and avoid breaking encapsulation by following or Fat model pattern or Domain-Driven Design(DDD)? (Read tell don't ask principle and Law Demeter)

4. Can a candidate achieve the solution with a minimum number of elements using the YAGNI principle (that is without creating unnecessary interfaces etc)?


# Rules they want you to follow:

You should not use any external libraries to solve this problem, but you can use external libraries or tools for building or testing purposes. Specifically, you can use unit-testing libraries or build tools available for your chosen language (e.g., JUnit, Ant, NUnit, Rspec, Rake, etc.).

They assess a number of things including the design aspect of your solution and your object-oriented programming skills. While these are small problems, They expect you to submit what you believe is production-quality code; code that you’d be able to run, maintain and evolve. You don’t need to gold plate your solution, however, we are looking for something more than a bare-bones algorithm.


# Things I tried to follow in this project/repo:

1. Tried to create all the required domain entities/models as per the problem statement.

2. Tried not to break encapsulation by avoiding getters & setters (as much as possible).

3. Tried to have an immutable state with value objects (as much as possible) so as to avoid concurrency issues (Thread safety).

4. Tried to have readable methods & variables naming so as to clear the intention (4 rules of simple design).

5. Tried to have small & logical commits.

6. Tried to avoid code duplication by refactoring/reusing duplicate code (DRY).

7. Didn't make interfaces as per YAGNI principles because for now, I don't feel the need for the same (Yes, I am aware of this principle also - "Program to interfaces rather than concrete implementation").

8. Tried to put some comments so as to make business logic more understandable.

9. Wrote the job on every class so as to clear its use case.


# Things I could have done/improved in this project/repo if given more time :

1. TDD with 100% code coverage.

2. Code duplication can be further reduced to some extent.

3. Level of indentation can be further reduced in some methods by breaking them into smaller methods.

4. Encapsulation of behavior in some classes can be further improved.

5. More mocking and stubbing of test data in unit tests.
