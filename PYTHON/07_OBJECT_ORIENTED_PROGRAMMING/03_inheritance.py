# Inheritance = Allow a class to inherit attributes and methods from another class
#               helps with code reusability and extensiblity
#               class Child(Parent)

class Animal:
    def __init__(self,name,is_alive):
        self.name = name
        self.is_alive = is_alive
        
    def eat(self):
        print(f"{self.name} is eating")
    
    def sleep(self):
        print(f"{self.name} is sleeping")

class Dog(Animal):
    pass

class Cat(Animal):
    pass

class Mouse(Animal):
    pass


dog = Dog("Scooby",True)
cat = Cat("Garfield",True)
Mouse = Mouse("Mickey",True)

print(dog.name,dog.is_alive)