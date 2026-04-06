# python reading files(.txt .json .csv)

import json
import csv


# 1. READING A .TXT FILE
file_path = "/media/ivwananji-silungwe/DEVELOPMENT/PROGRAMMING/PYTHON/09_FILE_HANDLING/files/output.txt"

try:
    with open(file_path, "r") as file:
        content = file.read()
        print(content)
except FileExistsError:
    print("That file was not found!")
except PermissionError:
    print("You are not allowed to read this file")
    
    

# 2. READING A .JSON FILE
file_path = "/media/ivwananji-silungwe/DEVELOPMENT/PROGRAMMING/PYTHON/09_FILE_HANDLING/files/output.json"

try:
    with open(file_path, "r") as file:
        content = json.load(file)
        print(content)
except FileExistsError:
    print("That file was not found!")
except PermissionError:
    print("You are not allowed to read this file")
    
    
# 2. READING A .CSV FILE
file_path = "/media/ivwananji-silungwe/DEVELOPMENT/PROGRAMMING/PYTHON/09_FILE_HANDLING/files/output.csv"

try:
    with open(file_path, "r") as file:
        content = csv.reader(file)
        for line in content:
            print(line)
except FileExistsError:
    print("That file was not found!")
except PermissionError:
    print("You are not allowed to read this file")
    