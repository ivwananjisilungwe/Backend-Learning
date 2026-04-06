#while loop = executes a block of code as long as the condition remains True

age = int(input("Enter Your Age:"))

while age <= 0:
    print("Age can't be negative")
    age = int(input("Enter Your Age:"))
print(f"You are {age} years old")
