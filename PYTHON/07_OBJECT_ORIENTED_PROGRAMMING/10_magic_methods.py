#Magic Methods = Dunder methods (double underscore) __init__,__str__,__eq__
#                They are automatically called by many Python's built-in operations
#                They allow Developers to define or customize the behavior of objects


class Book:
    
    def __init__(self, title, author, num_pages):
     
        self.title = title
        self.author = author
        self.num_pages = num_pages
        
    def __str__(self):
        return f"'{self.title}'by {self.author}"
    
    def __eq__(self, other):
        return self.title == other.title and self.author == other.author
    
    def __lt__(self, other):
        return self.num_pages < other.num_pages
    
    def __gt__(self, other):
        return self.num_pages > other.num_pages
    
    def __add__(self, other):
        return f"{self.num_pages} + {self.num_pages}"
    
    def __contains__(self, keyword):
        return keyword in self.title or keyword in self.author
    
    def __getitem__(self, key):
        if key == "title":
            return self.title
        elif key == "author":
            return self.author
        elif key == "num_pages":
            return self.num_pages
        else:
            return f"key {key} was not found"
    
        
        
book1 = Book("The Hobit","J.R.R Tolken",312)
book2 = Book("Harry Potter","The Philosopher's stone",502)
book3 = Book("The Lion, the witch and the wardrobe","C.S Lewis",712)

print(book1 < book2)