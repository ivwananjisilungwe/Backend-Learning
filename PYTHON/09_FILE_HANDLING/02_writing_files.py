#Python writing files (.txt, .json .csv)

import json
import csv

# EXAMPLE 1 WORKING WITH TXT FILES

employees = ["Eugene", "Squidward","SpongeBob","Patrick"]

# txt_data = "i like Nshima"

file_path = "/media/ivwananji-silungwe/DEVELOPMENT/PROGRAMMING/PYTHON/09_FILE_HANDLING/files/output.txt"

try:
    with open(file_path, "a") as file:
        for employee in employees:
            file.write(employee + " ")
        print("text file  was created! ")
except Exception:
    print("That file exists")
    
    
# EXAMPLE 2 WORKING WITH JSON FILES

employee_dict =  {
    "name" : "SpongeBob",
    "age" : 30,
    "job": "cook"
}


file_path = "/media/ivwananji-silungwe/DEVELOPMENT/PROGRAMMING/PYTHON/09_FILE_HANDLING/files/output.json"
try:
    with open(file_path, "w") as file:
        json.dump(employee_dict, file)
        print("Json file was created")
except FileExistsError:
    print("Json not created!")


# EXAMPLE 3 WORKING WITH CSV FILES

employee_csv = [
    ["Name", "Age", "Job"],
    ["SpongeBob", 30, "Cook"],
    ["Patrick", 37,"Unemployed"],
    ["Squidward", 50, "Cashier"]
]


file_path = "/media/ivwananji-silungwe/DEVELOPMENT/PROGRAMMING/PYTHON/09_FILE_HANDLING/files/output.csv"

try:
    with open(file_path, "w", newline="") as file:
        writer = csv.writer(file)
        for row in employee_csv:
            writer.writerow(row)
        print("csv file was created!")
except FileExistsError:
    print("That file already exists")
    