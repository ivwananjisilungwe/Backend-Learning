
# rock paper scissors game

import random
options = ("rock", "paper","scissors")
playing = True

while playing:

    player = None
    computer = random.choice(options)

    while player not in options:
        player = input("Enter a choice (rock, paper, scissors): ")
    
    print(f"player: {player}")
    print(f"computer: {computer}")
    
    if player == computer:
        print("It's a tie!")
    elif player == "rock" and computer == "scissors":
        print("You Win")
    elif player == "paper" and computer == "rock":
        print("You Win")
    elif player == "scissors" and computer == "paper":
        print("You Win")
    else:
        print("You Lose")
    if not input("Play Again? (y/n):").lower() == "y":
        playing = False
print("Thanks for playing")