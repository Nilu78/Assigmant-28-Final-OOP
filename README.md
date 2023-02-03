Duotech BMA(Bank Account Management Application)

In this OOP project, you will be creating an application that loads the data from an external file and generates customer bank accounts based on the loaded data. Youl will be utilizing OOP principles, Exceptions and File I/O to achieve the given task.

STEPS:

1.Design the Classes and Interfaces:
  
 a.BaseInterestRate interface - An interface that represents the behaviors common for all bank accounts.
  
  Field:

   * BASE_INTEREST_RATE - a constant that represents the the base interest rate for all bank account types set by the Federal Reserve. Must be initialized to 2.5.
  
  Methods:

   * getBaseInterestRate() - a default method that returns the BASE_INTEREST_RATE. 
	 * setInterestRate() - an abstract void method that will be implemented by the concrete classes to set the specific interest rate for that account type.
 
 b.Account Class - An abstract class that represents a generic bank account. Implements BaseInterestRate interface.
   
   Fields(protected):

   * name - represents an accountholder's full name
	 * ssn - represents an accountholder's ssn
	 * balance - represents the balance of the accountA
	 * accountNumber - represents the unique account number
   * routingNumber - represents the routing number
	 * interestRate - represents the base interest rate for all accounts

  Constructor:

   * takes name, ssn, balance as parameters and initializes them
	 * initializes accountNumber by calling generateAccountNumber() method
   * initializes routingNumber by calling generateRoutingNumber() method
	 * initializes interestRate by calling getBaseInterestRate() method of BaseInterestRate interface

  Methods:

   * generateAccountNumber() - generates an 11-digit generic Account number using the below formula:
      Last four digits of ssn + random 7 digit number
	 * generateRoutingNumber() - generates a 9-digit Routing number number using the below formula:
      00 + random 7 digit number
   * deposit() - takes a double called Amount as a parameter.
     Adds the passed amount to the balance and prints out a message about the new balance.
   * withdraw() - takes a double called Amount as a parameter.
     Subtracts the given amount from the balance and prints out a message about the new balance.
     If the amount being withdrawn is greater than the current balance, prints out an error message.
   * showInfo() - Prints information about the account. It includes name, ssn, accountNumber, routingNumber
     and  balance printed on separate lines

	   Ex:
      NAME: Arielle Duncan
      SSN: 444-10-2638
      ACCOUNT NUMBER: 226386906582
      ROUTING NUMBER: 002561772
      BALANCE: 1000.0 


 c.Checking Class - A class that represents a Checking account.
  Must extend Account class to inherit generic account properties and behaviors.

  Fields:

   * debitCardNo - represents a debit card number 
	 * debitCardPIN - represents a debit card pin 
	 

  Constructor:

   * takes name, ssn, balance as parameters and initializes them through superclass constructor
	 * changes the accountNumber by adding 1 before it since checking accounts must start with 1.
   * initializes debitCardNo by calling generateDebitCardNo() method
	 * initializes debitCardPIN by generating and assigning 4 digit random number.
	 * sets the interest rate for Checking account class by calling setInterestRate() method.


  Methods:
   
   * setInterestRate() - an abstract method that is inherited from BaseInterestRate interface. Must be impemented as:
     This class's interestRate must be set as 15% of the super class's interestRate.
   * generateDebitCardNo() - generates an 16-digit Debit Card number using the below formula:
      9 + random 15 digit number   
   * showInfo() - Overrides super class's showInfo() method by ADDING Checking account specific info
	   such as account type, debitCardNo, debitCardPIN and interestRate

	   Ex:
      NAME: Arielle Duncan
      SSN: 444-10-2638
      ACCOUNT NUMBER: 226386906582
      ROUTING NUMBER: 002561772
      BALANCE: 1000.0
      ACCOUNT TYPE: Checking
      DEBIT CARD NUMBER: 9804579327874081
      DEBIT CARD PIN: 8689
      INTEREST RATE: 0.375% 

 d.Savings Class - A class that represents a Savings account.
  Must extend Account class to inherit generic account properties and behaviors.

  Fields:

   * safetyDepositBoxID - represents a safety deposit box id 
   * safetyDepositBoxPin - represents a safety deposit box pin 
	 

  Constructor:

   * takes name, ssn, balance as parameters and initializes them through superclass constructor
	 * changes the accountNumber by adding 2 before it since savings accounts must start with 2.
   * initializes safetyDepositBoxID by generating and assigning a 3-digit random number.
	 * initializes safetyDepositBoxPin by generating and assigning a 4-digit random number.
	 * sets the interest rate for Savings account class by calling setInterestRate() method.


  Methods:
   
   * setInterestRate() - an abstract method that is inherited from BaseInterestRate interface. Must be impemented as:
     This class's interestRate must be set as 0.25 less than the super class's interestRate.
   * showInfo() - Overrides super class's showInfo() method by ADDING Savings account specific info
	   such as account type, safetyDepositBoxID, safetyDepositBoxPin and interestRate
	   Ex:
      NAME: Arielle Duncan
      SSN: 444-10-2638
      ACCOUNT NUMBER: 226386906582
      ROUTING NUMBER: 002561772
      BALANCE: 1000.0
      ACCOUNT TYPE: Checking
      SAFETY DEPOSIT BOX ID: 793
      SAFETY DEPOSIT BOX PIN: 9877
      INTEREST RATE: 2.25% 
  
 e.Utility Class - A class to store static utility methods.
  
  Method:
  * readFromCSV() - a static method that accepts a String parameter that represents a path to a csv file.
     It reads the content of a given csv file and returns the content as List<List<String>> where each List<String> represents a row of information in a file.
     Uses Files class to read from a file and handles the checked exception with a regular try-catch block or try-with-resources block.


2.Implement the application logic in the main method:
  
  Your application should do the following:
  1. Asks the user to enter the name of the csv file. (3 diffrent csv files have been added to the project.)
  2. Reads the data from the given file using the Utility class method.
  3. Based on the obtained data from the file, creates corresponding Savings and Checking accounts and stores them in a collection.
  4. Displays to the user the created bank accounts with its details.
  5. Asks the user if he/she wants to load another file. If yes, repeats the process, if not ends the application.

  The sample console output has been attached for reference.