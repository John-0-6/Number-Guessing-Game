# Number Guessing Game (Console-Based)

A simple **console-based Number Guessing Game** built in **Java**. In this game, the program randomly generates a number between 1 and 100, and the player tries to guess it. The program gives hints if the guess is too high or too low.

---

## Features

- Random number generation between 1 and 100  
- Hints for "HIGHER" or "LOWER"  
- Looping gameplay until the correct number is guessed  
- Option to play again after each round  
- Input handling for clean game flow  

---

## Technologies Used

- Java  
- `Scanner` for user input  
- `Random` for generating random numbers  

---

## How It Works

1. The program generates a random number between 1 and 100.  
2. The player guesses a number.  
   - If the guess is higher than the random number, the program prints **"LOWER"**.  
   - If the guess is lower, the program prints **"HIGHER"**.  
   - If the guess is correct, the program prints **"YOU WIN!"**.  
3. After each round, the player is asked if they want to play again.  
4. The game continues until the player chooses not to play again.  

---

## Usage

1. **Clone the repository:**
   ```bash
   git clone https://github.com/John-0-6/Number-Guessing-Game.git
