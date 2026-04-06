# List Comprehension = a way to create a new list with less syntax
#                       can mimic certain lambda functions, easier to read

#-----Example 1: Using list comprehension-----
numbers = [1,2,3,4,5,6]
squares = [n**2 for n in numbers]
print(squares)

#-----Example 2: Using list comprehension with condition-----
even_numbers = [n for n in numbers if n % 2 == 0]
print(even_numbers)

#-----Example 3: Using list comprehension with nested loops-----
matrix = [[1,2,3],[4,5,6],[7,8,9]]
flattened = [num for row in matrix for num in row]
print(flattened)

#-----Example 4: Using list comprehension with a function-----
def square(x):
    return x * x 
squared_numbers = [square(n) for n in numbers]
print(squared_numbers)  

#-----Example 5: Using list comprehension to create a list of tuples-----
pairs = [(x, y) for x in range(3) for y in range(3)]
print(pairs)


#-----Example 6: Using list comprehension to filter and transform data-----
names = ["Alice", "Bob", "Charlie", "David"]
short_names = [name.upper() for name in names if len(name) <= 4]    


print(short_names)