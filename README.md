🎲 Java Number Guessing Game 🎲
In this project, I developed a simple yet engaging number guessing game using Java, where the player tries to guess a randomly generated number between 1 and 100. 
The game demonstrates the following key programming concepts:
Random Number Generation - The computer selects a random number, creating a unique challenge each time.
User Input Handling - Using Scanner to take guesses from the player and check against the target number.
Score and Attempt Tracking - The program tracks each attempt made by the player, adjusting the score and guiding them closer to the answer.
Game Rules:
The game gives hints: "Choose a greater number" or "Choose a smaller number" until the correct guess is made.
The score is calculated based on a binary search complexity model, representing the minimum required attempts to solve the game.
Key Takeaways:
This project taught me how to implement basic control structures and conditional logic in Java, alongside user interaction through the console. It’s an excellent example of applying Java’s Random and Scanner classes to create interactive applications.


🏦 Java Console-Based ATM System Project 🏦
Project Structure:
Transaction Class: Stores transaction details (type and amount) to maintain a transaction history for each account.
Account Class: Manages core banking operations, such as deposit, withdraw, and transfer. It also tracks the balance and maintains a log of transactions.
ATM Class: Acts as the main interface for user interaction. It provides options like viewing transaction history, depositing, withdrawing, transferring funds, and exiting.
ATMSystem Class (Main Class): The entry point of the program, where an ATM instance is initialized and the system is launched.
Key Features:
User Authentication - Users must enter a user ID and PIN to access ATM functionalities, simulating a secure login.
Core Operations:
Transaction History - Displays a list of past transactions.
Withdraw - Allows users to withdraw money from their balance.
Deposit - Enables users to deposit funds into their account.
Transfer - Supports fund transfers between accounts.
Quit - Exits the ATM session.
This project strengthened my understanding of object-oriented principles in Java, such as encapsulation, abstraction, and class design, as well as console-based input handling. By simulating an ATM, I also gained experience with user validation and transaction management.
For simplicity, the code doesn't handle existing accounts or multiple users comprehensively. In a complete system, you'd typically have a way to store and retrieve user accounts.
