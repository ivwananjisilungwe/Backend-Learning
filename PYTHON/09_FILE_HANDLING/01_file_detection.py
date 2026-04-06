#Python file detection

import os

file_path = "/media/ivwananji-silungwe/DEVELOPMENT/PROGRAMMING/PYTHON/09_FILE_HANDLING/stuff/"


if os.path.exists(file_path):
    print("file exists")
    
    if os.path.isfile(file_path):
        print("Thats is a file")
    elif os.path.isdir(file_path):
        print("That is a directory")
else: 
    print("It doesn't exists")