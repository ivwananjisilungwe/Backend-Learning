# object = A "bundle" of related attributes (variables) and methods (functions)
#           Ex. phone, cup, book
#           you need a "class" to create many objects


# class = (blueprint) used to design the structure and layout of an object

#-----------------Example 1------------
#-----------------Attributes-----------

from car import *

car1 = Car("mustang",2024,"red",False)
print(car1.model)
print(car1.year)
print(car1.color)
print(car1.for_sale)

car2 = Car("corvette",2025,"blue",True)
print(car2.model)
print(car2.year)
print(car2.color)
print(car2.for_sale)

#---------------Methods----------------
car1.drive()
car2.stop()
car1.describe()

