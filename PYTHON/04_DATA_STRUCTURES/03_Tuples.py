# Tuple = is a python data structure used to store multiple elements
# it's similar to a list, but the key difference is that tuples are immutable

# 1.Creating a Tuple
numbers = (1, 2, 3, 4, 5)
print(numbers)

data = (10, "Python", 3.14, True)
print(data)

# 2. Tuple with One Item
single = (5,)
print(type(single), single)

# 3. Accessing Tuple Elements
fruits = ("apple", "banana", "mango")

print(fruits[0])   # apple
print(fruits[1])   # banana
print(fruits[-1])  # mango

# 4. Tuple Slicing
numbers = (10, 20, 30, 40, 50)
print(numbers[1:4])

# 5. Tuple Packing and Unpacking
person = ("John", 25, "Engineer")

name, age, job = person
print(name)
print(age)
print(job)

# 6. Useful methods on tuples
fruits = ("apple","orange","banana","coconut","coconut")
# print(dir(fruits))
# print(help(fruits))
# print(len(fruits))
# print("pineapple" in fruits)
# print(fruits.index("apple"))
# print(fruits.count("coconut"))
# print(fruits[2])
# fruits[0] = "mango"
# print(fruits)

print(fruits)