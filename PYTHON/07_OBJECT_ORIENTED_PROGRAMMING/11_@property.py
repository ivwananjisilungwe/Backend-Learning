#@property = Decorater used to define as a property (it can be accessed like an attribute)
#            Benefit: Add additional logic when read, write, or delete attributes
#            Gives you gettter,setter and deleter method


class Rectangle:
    def __init__(self, width,height):
        self._width = width
        self._height = height
        


    #GETTERS
    @property
    def width(self):
        return f"{self._width:.1f}cm"

    @property
    def height(self):
        return f"{self._height:.1f}cm"

    #SETTERS
    @width.setter
    def width(self, new_width):
        if new_width > 0:
            self._width = new_width
        else:
            print("Width must be greater than 0")
            
            
    @height.setter
    def height(self, new_height):
        if new_height > 0:
            self._height = new_height
        else:
            print("Height must be greater than zero")
            
    # deleter method
    @width.deleter
    def width(self):
        del self.width
        print("Width has been deleted")
        
    @height.deleter
    def width(self):
        del self.height
        print("height has been deleted")

        
rectangle = Rectangle(3,5)
print(rectangle.height)
print(rectangle.width)

rectangle.width = 9
rectangle.height = 10
print(rectangle.height)
