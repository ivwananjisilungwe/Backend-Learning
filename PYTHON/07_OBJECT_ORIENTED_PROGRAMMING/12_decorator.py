#Decorator = A function that extends the behavior of another function
#            w/o modifying the base funtion
#           pass the base function as an argument to the decorator

def add_sprinkles(func):
    def wrapper(*args, **kwargs):
        print("you add sprinkles")
        func()
    return wrapper

def add_fudge(func):
    def wrapper(*args, **kwargs):
        print("you add fudge")
        func()
    return wrapper
        
        

@add_sprinkles
@add_fudge
def get_ice_cream(flavour):
    print(f"here is your {flavour} ice cream")
    
get_ice_cream()