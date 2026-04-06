#* A two-dimensional list = is a list of lists
#* Each element of the main list is itself a list this is useful for representing
#* things like chessboard, spreedsheet, or any kind of row-column structure
#*
#*
#* ------------------Example 1---------------------------
groceries = [["apple", "orange", "banana", "coconut"],
             ["celery", "carrots","potatoes"], ["chicken", "fish", "turkey"]]
for collection in groceries:
    for food in collection:
        print(food, end=" ")
    print()

#* ------------------Example 2---------------------------
num_pad = ((1,2,3),
           (4,5,6),
           (7,8,9),
           ("*", 0, "#")
           )

for row in num_pad:
    for num in row:
        print(num, end=" ")
    print()