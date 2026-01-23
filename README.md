🚀 Features

✅ User Signup with duplicate UserId check

✅ User Signin

✅ View User Profile

✅ Check Balance

✅ Make Transactions between users

✅ Automatic balance deduction & credit

✅ Transaction history (sent & received)

✅ Unique Transaction ID generation

✅ Menu-driven terminal interface

✅ Clean object-oriented design

🛠️ Tech Stack

Language: Java

IDE: IntelliJ IDEA

Data Structures: ArrayList

Input Handling: Scanner

Version Control: Git & GitHub

📂 Project Structure
project1/
│
├── src/
│   ├── Main.java          # Application flow & menu logic
│   ├── User.java          # User model (balance, profile)
│   └── Transactions.java # Transaction model
│
└── README.md

🔄 Application Flow

Signup

Create a new user

Prevents duplicate UserIds

Signin

Access user-specific features

User Menu

View profile

Check balance

Make a transaction

View transaction history

Logout

Transaction Logic

Sender & receiver must exist

Sender must have sufficient balance

Balance updates happen atomically

Transaction is recorded

🧠 Core Concepts Practiced

Object-Oriented Programming (OOP)

Separation of concerns (User vs Transaction)

Helper methods for searching

Menu-driven programs

State management in terminal apps

Real-world business logic simulation

▶️ How to Run

Clone the repository:

git clone https://github.com/yaswanth24k/project1.git


Open in IntelliJ IDEA

Run Main.java

📸 Sample Output
Transaction Successful!
Transaction{
  transactionId='TXN1',
  senderId='user1',
  receiverId='user2',
  paymentType='UPI',
  amount=500.0
}

🧭 Future Enhancements

🔐 Password-based authentication

🗄️ File or database storage

🌐 Web version (Spring Boot / Backend)

📊 Transaction summaries

🧪 Unit testing

🧱 Service-layer refactoring

🎯 Purpose of This Project

This project was built to move beyond tutorials and understand:

how systems work internally

how data flows between components

how backend logic is structured before frameworks

👤 Author

Yaswanth
Computer Science Engineering Student
Learning backend development step by step 🚀

⭐ Notes

This is a learning project and does not handle real money.
