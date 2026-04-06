# class variables = shared among all instances of a class
#                   Defined outside the constructor
#                   Allow you to share data among all the objects created from that class


class Student:
    
    class_year = 2024
    num_students = 0
    
    def __init__(self, name,age):
        self.name = name
        self.age = age
        Student.num_students += 1
        

student1 = Student("Ivwananji", 21)
student2 = Student("SpongeBob", 30)
student3 = Student("Patrick", 55)
student4 = Student("Squidward", 75)
student5 = Student("Sandy", 15)

print(f"My graduating class of {Student.class_year} has {Student.num_students} students")
print(student1.name)
print(student2.name)
print(student3.name)
print(student4.name)
print(student5.name)