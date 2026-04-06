# multiple inheritance = inherit from more than one parent
#                        C(A,B)

#? multilevel inheritance = inherit from a parent which also inherits from another parent class
#?                          C(B) <- B(A) <- A




class Animal:
    def __init__(self, name):
        self.name = name
    
    def eat(self):
        print(f"{self.name} is eating")
        
    def sleep(self):
        print(f"{self.name} is sleeping")


class Prey(Animal):                     #* multilevel inheritance
    def flee(self):
        print(f"{self.name} is fleeing")

class Predator(Animal):
    def hunt(self):
        print(f"{self.name} is hunting")

class Rabbit(Prey):
    pass

class Hawk(Predator):
    pass

class Fish(Prey,Predator):           #? multiple inheritance
    pass

rabbit = Rabbit("Bugs")
hawk = Hawk("Tony")
fish = Fish("Nemo")

rabbit.flee()
# rabbit.hunt()

hawk.hunt()

fish.flee()
fish.hunt

rabbit.eat()
hawk.sleep()
