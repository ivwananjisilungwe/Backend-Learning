# Custom Exceptions = user-defined exceptions that allow you to create specific error types for your application.
#                         they can be used to provide more meaningful error messages and to handle specific error cases in a more controlled way.


#1.Example of a custom exception
class NegativeNumberError(Exception):
    def __init__(self, message="Negative numbers are not allowed"):
        self.message = message
        super().__init__(self.message)
        

        
def calculate_square_root(number):
    if number < 0:
        raise NegativeNumberError()
    return number ** 0.5

try:
    result = calculate_square_root(-4)
    print(result)
except NegativeNumberError as e:
    print(e)    
    

#2.Another example of a custom exception
class InvalidAgeError(Exception):
    def __init__(self, message="Age must be between 0 and 120"):
        self.message = message
        super().__init__(self.message)
        
def validate_age(age):
    if age < 0 or age > 120:
        raise InvalidAgeError()
    return True


try:    validate_age(150)
except InvalidAgeError as e:
    print(e)
    
    

        

