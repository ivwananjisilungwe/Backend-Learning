# Data types = define the type of variable or value

#! 1.Numeric Types

#int
age = 4
print(age, type(age))

#float
price = 4.55
print(price, type(price))

#complex
z = 3 + 4j
print(z, type(z))

#? 2.Text Type

#String
name = "IVWANANJI"
print(name, type(name))

#* 3.Sequence Type

#list(mutable)
numbers =[1, 2, 3, 4]
print(numbers, type(numbers))

#tuple(immutable)
coordinates = (10,20,30,40,10)
print(coordinates, type(coordinates))

#range
r = range(1,6)
print(list(r), type(r))

#? 4.Mapping Type
#dictianary
student = {
    "name":"john",
    "age":21,
    "course":"computer science"
}
print(student, type(student))

#! 5. Set Types

#set(mutable)
unique_numbers = {1,2,3,4,4,5,3,2,18}
print(unique_numbers, type(unique_numbers))

#frozenset(immutable)
frozen = frozenset([1,2,3])
print(frozen)

#? 6.boolean Types

is_logged_in = True
print(is_logged_in, type(is_logged_in))

#! 7.Binary Types

#byte
b = b"hello"
print(b,type(b))

#bytearray
ba = bytearray([65,66,67])
ba[0] = 90
print(ba, type(ba))

#memoryview
data = b"Python"
mv = memoryview(data)
print(mv ,type(mv))