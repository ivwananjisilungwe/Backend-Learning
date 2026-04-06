# module =  a file containing code you want to include in your program 
#            use 'import' to include a module (built-in or your own)
#            useful to break up large program reusable separate files.

# import math
# import math as m
# from math import pi

import example

result = example.pi
result = example.square(2)
result = example.area(5)
result = example.cube(3)
result = example.circumference(7)


print(result)