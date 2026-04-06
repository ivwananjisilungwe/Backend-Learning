# raising exceptions = the process of intentionally triggering an exception in your code when a certain condition is met.
# This is done using the raise keyword, followed by an instance of the exception you want to raise.
# it allows you to create custom error messages and to handle specific error cases in a more



#1.Raising a built-in exception
def divide(a,b):
    if b == 0:
        raise ZeroDivisionError("You cant divide by zero!!!")
    return a / b

divide(12,6)


# 2.Example 2
user_input = int(input("Enter a number:"))

if user_input < 0 or user_input > 100:
    raise ValueError("Input must be a positive integer between 0 and 100")
print(user_input)