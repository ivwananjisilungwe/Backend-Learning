# if  = Do some code only IF some condition is True
#       Else do something else

age = int(input("Enter your age:"))
if age > 100:
    print("You are too old to sign up!")
elif age >= 18:
    print("You are now signed up!")
elif age < 0:
    print("You haven't been born yet!")
else:
    print("You must be 18+ to sign up!")

a = 4
b = 9

if a > b:
    print(f"{a} is greater than {b}")
else:
    print(f"{b} is greater than {a}")