#Typecasting = the process of converting a variable from one datatype to another
#               str(), int(), float(),bool()

name = "Ivwananji Silungwe"
age = 21
gpa = 3.2
is_student = True


#float to int
gpa = int(gpa)
print(type(gpa))

#int to float
age = float(age)
print(type(age))

#int to str
age = str(age)
age += "1"
print(type(age))

#str to boolean
name = bool(name)
print(type(name))