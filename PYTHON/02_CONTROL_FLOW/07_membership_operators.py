# Membership Operators = used to test whether a value or value is found in a sequence
#                        (string, list, tuple, set and dictionary)
#                         1. in
#                         2. not in


#-----Example 1: Using 'in' operator with a string-----
word = "APPLE"

letter = input("Guess a letter in the secret word: ")

if letter in word:
    print(f"There is a {letter}")
else:
    print(f"{letter} was not found")
    

#-----Example 2: Using 'not in' operator with a list-----
fruits = ["apple","banana","orange"]
fruit = input("Enter a fruit: ")
if fruit not in fruits:
    print(f"{fruit} is not in the list")
else:
    print(f"{fruit} is in the list")