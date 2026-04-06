# function = is a block of reusable code that performs a specific task
#            instead of writing the same block of code many times, you place it
#            inside a function and call it whenever you need it

#* 1.Defining a function
def greet():
    print("Hello")

greet()

# 2.Functions with parameters
def greetUser(name):
    print(f"hello {name}")

greetUser("Ivwananji")

#? 3.Functions with return values
def add(a,b):
    return a + b

result = add(4,10)
print(result)

#* 4.Multiple Return Values
def math_operations(a,b):
    return a + b, a * b

sum_result,product = math_operations(5,5)
print(sum_result)
print(product)

#? 5.Default Parameters
def greet(name = "Guest"):
    print("hello", name)
greet()

#* 6.Keywords Arguments
def student(name,age):
    print(name,age)
student(name="ivwananji", age=21)

#! 7.Arbitrary number of arguments
def sum_all(*numbers):
    total = 0
    for num in numbers:
        total += num
    return total
print(sum_all(1,2,3,4,5))


# 8.Arbitrary number of keyword arguments
def print_info(**kwargs):
    for key, value in kwargs.items():
        print(f"{key}: {value}")
print_info(name="ivwananji", age=21)

#* 9.Lambda Functions
square = lambda x: x * x
print(square(5))

numbers = [1,2,3,4,5]
squared_numbers = list(map(lambda x: x * x, numbers))
print(squared_numbers)

# 10. Nested Functions
def outer():
    def inner():
        print("Inner Function")
    inner()
outer()

# 11.Recursion
def factorial(n):
    if n == 1:
        return 1
    return n * factorial(n-1)
print(factorial(4))

# 12.Functions as Objects
def greet(name):
    print(f"Hello {name}")

say = greet
say("Ivwananji")

# 13.Passing Functions to other functions
def sayHi():
    print("hello")

def call_function(func):
    func()
    
call_function(sayHi)





