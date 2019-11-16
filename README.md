This is a gradle based on java. It's an Objected Oriented Design(OOD) problem generally askied in interviews. Main reason behind asking these kind of problems in interview is to see whether a candidate can do following :
1. Can a candidate write a working code in given short span of time.
2. Can a candidate write higly readbale code. Intention must be clear by reading the code.
3. Can a candidate follow the principle the of DRY (Don't Repeat Yourself) and avoid to break encapsulation by following Domain Driven Design(DDD).
4. Can a candidate achieve the solution with minimum number of elements using YAGNI principle (that is without creating unnecesarry interfaces etc).

**PROBLEM STATEMENT**

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
