# Arithmetic Operators = are used to perform operations on variables and values
import math

num = 10

# 1.Addition
num += 1
print(f"Sum: {num}")

# 2.Subtraction
num -= 2
print(f"Diff: {num}")

# 3.Multiplication
num *= 3
print(f"Product: {num}")

# 4.Division
num /= 2
print(f"Quotient: {num}")

# 5.Exponent
num **= 2
print(f"Exponent: {num}")

# 6.Modulus
num %= 2
print(f"Modulus: {num}")

# Built-in Math functions
x = 3.24
y = -4
z = 5

# 1.round off function
result = round(x)
print(result)

# 2.absolute value function
result = abs(y)
print(result)

# 3.power function
result = pow(4,3)
print(result)

# 4.Max function
result = max(x,y,z)
print(result)

# 5.Min function
result = min(x,y,z)
print(result)

#? Constants from the math module eg(pi, e,)
a = 9
b = 5.3
c = 10.2


print(math.pi)

print(math.e)

result1 = math.sqrt(a)
result1 = round(result1)
print(result1)

result1 = math.ceil(b)
print(result1)

result1 = math.floor(c)
print(result1)

#! Exercise 1: Calculate the circumference of a Circle

print("THE CIRCUMFERENCE OF A CIRCLE")
radius = float(input("Enter the radius of a Circle: "))

circumference = 2 * math.pi * radius

print(f"Circumference is: {round(circumference, 2)} cm")

#* Exercise 2: Calculate the Area of a Circle

print("THE AREA OF A CIRCLE")
radius1 = float(input("Enter the radius of a circle: "))

area = math.pi * pow(radius1, 2)
print(f"The area is: {round(area,2)}cm^2")

#? Exercise 3: Find the Hypotinus of a Triangle
print("THE HYPOTINUS OF A TRIANGLE")
a = float(input("Enter side A: "))
b = float(input("Enter side b: "))

c = math.sqrt(pow(a,2) + pow(b,3))

print(f"side C is: {c}")