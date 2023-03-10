# Bank Kata

## Problem Description
Create a simple bank application with the following features:
- Deposit into Account
- Withdraw from an Account
- Print a bank statement to the console

## Acceptance Criteria
Statement should have transaction in the following format:
```
> Date          | Amount    | Balance
> 10/04/2014    | 500.00    | 1400.00
> 02/04/2014    | -100.00   | 900.00
> 01/04/2014    | 1000.00   | 1000.00
```

## Starting Point and Constraints
1. Start with a class with the following stucture:
    ``` java
    public class Account {
        public void deposit(int amount);
        public void withdraw(int amount=;
        public void printStatement(); 
    }
    ```
2. You are not allowed to add any other public methods to this class.
3. Use String and Integers for dates and amount (keep it simple).
4. Don't worry about spacing in the statement printed on the console.