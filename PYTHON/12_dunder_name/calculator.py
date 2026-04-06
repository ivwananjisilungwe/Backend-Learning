# if __name__ == "__main__": = This is a common Python idiom that checks if the script is being run directly
# (as the main program) or if it is being imported as a module in another script.
# When a Python script is run directly, the special variable __name__ is set to "__main__". 
# However, when the script is imported as a module, __name__ is set to the name of the module.
# This allows you to write code that will only execute when the script is run directly, and
# not when it is imported. This is useful for testing or for providing a command-line interface to a module.



def add(a,b):
    return a + b

def sub(a,b):
    return a -b

print(__name__)
if __name__ == "__main__":
    
    print("This is a calculator!")
    num1 = int(input("Enter the first number:"))
    num2 = int(input("Enter the second number:"))

    print(f"The sum is: {add(num1,num2)}")
    print(f"The difference is: {sub(num1,num2)}")