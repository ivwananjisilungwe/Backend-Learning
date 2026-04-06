#! Set =  a collection of unique and unordered elements
# No Duplicate values, unordered(items don't have an index)
# Mutable(you can add or remove items),Uses curly braces {}

# 1. Creating a Set
digits = {10,20,30,40}
print(digits)

# 2. Creating an Empty Set
my_set = set()

# 3. Adding Elements
numbers = {1, 2, 3,2,1}
numbers.add(4)
print(numbers)

# 4. Removing Elements
numbers.remove(2)
numbers.discard(1)
print(numbers)

# 5. Set Operations (Very Important)
A = {1, 2, 3, 4}
B = {3, 4, 5, 6}

print("Union:", A | B)
print("Intersection:", A & B)
print("Difference:", A - B)

# 6. Checking Membership
numbers = {1, 2, 3}
print(2 in numbers)

#7.Useful set methods
fruits = {"apple","orange","banana","coconut"}
# print(dir(fruits))
# print(help(fruits))
# print(len(fruits))
# print("pineapple" in fruits)
# print(fruits[0])
fruits.add("pineapple")
fruits.remove("apple")
fruits.pop()
print(fruits)
