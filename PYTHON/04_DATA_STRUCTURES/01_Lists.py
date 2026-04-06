#! List = a collection data type used to store multiple values in a single variable
#!Lists are ordered, mutable and allow duplicate values

# 1.Creating a List
numbers = [1,2,3,4,5,6,7]
names = ["Ivwananji","silungwe"]
mixed = [10,"python",True,3.5]
for x in mixed:
    print(x)

# 2.accessing elements of a list
print(numbers[-1])
print(mixed[3])

# 3.Adding Elements
numbers.append(40)

numbers.insert(2,100)


# 4.Removing Elements
names.remove("Ivwananji")
numbers.pop(2)
numbers.clear()
print(names)

# 7. Looping Through a List
digits = [1,2,3]

for x in digits:
    print(digits)

# 8. List Slicing
numbers = [10, 20, 30, 40, 50]
print(numbers[1:4])  # [20, 30, 40]

# 9.Useful methods on lists
fruits = ["apple","orange","banana","coconut"]
# print(dir(fruits))
# print(help(fruits))
# print(len(fruits))
# print("pinapple" in fruits)

# fruits[0] = "pinapple"
# fruits.append("pineapple")
# fruits.remove("apple")
# fruits.index(0, "pineapple")
# fruits.sort()
# fruits.reverse()
# fruits.clear()
# print(fruits.index("apple"))
# print(fruits.count("banana"))
print(fruits)