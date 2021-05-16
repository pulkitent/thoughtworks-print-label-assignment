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


PS - trunk based development was followed with proper TDD approach. And was hosting this project on gitlab but in the end migrated here on Github.


# What the company is looking for?
They are looking for people who can write code that has flexibility built in, by adhering to the principles of Object Oriented Development, and have the ability to deal with the real-life constraints / trade-offs while designing a system.

It is important to note that they are not looking for a GUI and they are not assessing you on the capabilities around code required to do the I/O. The focus is on the overall design. So, while building a solution, it would be nicer if input to the code is provided either via unit tests or a file. Using command line (for input) can be tedious and difficult to test, so it is best avoided. Following is a list of things to keep in mind, before you submit your code:

1. Is behaviour of an object distinguished from its state and is the state encapsulated?

2. Have you applied SOLID principles to your code?

3. Have you applied principles of YAGNI and KISS (additional info here)?

4. Have you looked at basic refactoring to improve design of your code?

5. Finally, and foremost, are the principles applied in a pragmatic way.

Simplicity is the strongest of the trait of a piece of code. However, easily written code may not necessarily be simple code.


# Things I tried to follow:

1. Tried to create all the required domain entities/models as per problem statement

2. Tried not to break encapsulation by avoiding getters & setters (as much as possible)

3. Tried to have immutable state with value objects (as much as possible) so as to avoid concurrency issues (Thread safety)

4. Tried to have readable methods & variables naming so as to clear the intention (4 rules of simple design).

5. Tried to have small & logical commits

6. Tried to avoid code duplication by refactoring/reusing duplicate code (DRY) but still code duplication can be improved if given more time

7. Didn't make interfaces as per YAGNI principles because for now I don't feel the need for the same (Yes, I am aware of this principle also - "Program to interfaces rather than concrete implementation")

8. Tried to put some comments so as to make business logic more understandable

9. Wrote the job on every class so as to clear it's use case

This is a gradle project based on java. It's an Objected Oriented Design(OOD) problem generally asked in interviews. Main reason behind asking these kind of problems in interview is to see whether a candidate can do following :

1. Can a candidate write a working code in given short span of time.

2. Can a candidate write higly readbale code. Intention must be clear by reading the code.

3. Can a candidate follow the principle the of DRY (Don't Repeat Yourself) and avoid to break encapsulation by following Domain Driven Design(DDD).

4. Can a candidate achieve the solution with minimum number of elements using YAGNI principle (that is without creating unnecesarry interfaces etc).


# Things I could have done/improved if given more time :

1. TDD with 100% code coverage

2. Code duplication can be further reduced at some extent

3. Level of indentation can be further reduced in some methods by breaking them into smaller methods

4. Encapsulation of behaviour in some classes can be further improved

5. More mocking and stubbing of test data in unit tests
