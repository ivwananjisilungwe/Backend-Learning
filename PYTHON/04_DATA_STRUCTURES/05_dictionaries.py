# dictionary = a collection of {key:value} pairs
#              ordered and changeable

# 1.Creating a Dictionary
student = {
    "name": "John",
    "age": 21,
    "course": "Computer Science"
}


# 2.Accessing values
print(student["name"])
print(student.get("age"))

# 3.Adding or Updating Items
student["grade"] = "A"          # adds a new key
student["course"] = "Math"


# 4. Removing Items
student.pop("age")
del student["course"]
student.clear()

# 5. Looping Through a Dictionary
# loop through keys
for key in student:
    print(key)

# loop through values
for value in student.values():
    print(value)

# 6.Nested Dictionaries
students = {
    "student1": {"name": "John", "age": 20},
    "student2": {"name": "Mary", "age": 22}
}

print(students)
#* Useful methods on dictionaries
capitals = {"USA": "Washington D.C.",
            "India": "New Delhi",
            "China": "Beijing",
            "Russia": "Moscow"
            }

# print(dir(capitals))
# print(help(capitals))
# print(capitals.get("japan"))
#
# if capitals.get("japan"):
#     print("That capital exists")
# else:
#     print("That capital does not exist")
#
# capitals.update({"Germany": "Berlin"})
# capitals.pop("China")
# capitals.popitem()
# capitals.clear()

# keys = capitals.keys()

# for key in capitals.keys():
#     print(key)
#
# for value in capitals.values():
#     print(value)

for key,value in capitals.items():
    print(f"{key}: {value}")