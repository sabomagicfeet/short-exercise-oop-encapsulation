## 🤓 Study Prompts

Use the following questions to guide your exploration and learning! 🗺

- Run the `main` method on the `Main` class, what is it doing? What is being outputted to the console?


- Look at the `DodgyBankAccount`, this class is not well-encapsulated.
  Can you note down the problems with how the class is designed, and the ways it is being misused?
  - We can access to the accountBalance and rewardAmount so without put deposit we can put rewardAmount and we can change the accountBalance without put deposit.
    - This is dangerous.

- Compare and contrast the `DodgyBankAccount` and the `SecureBankAccount`, how is the `SecureBankAccount` different to
  the `DodgyBankAccount`? How is it designed to prevent it from being misused? Are there instances of better method names
  for clearer abstraction?
  - SecureBankAccount hide rewardAmount and accountBalance, so we can't put money or reward value arbitrarily. 