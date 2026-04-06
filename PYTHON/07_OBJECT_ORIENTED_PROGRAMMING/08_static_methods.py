#Static method = A method that belong to a class rather than to any object from that class(instance)
#                Usually used for general utility functions

#instance methods = Best for operations of the class(objects)
#static Methods Best for utilty functions

class Employee:
    
    def __init__(self, name, position):
        self.name = name
        self.position = position
        
    def get_info(self):
        return f"{self.name} = {self.position}"
    
    @staticmethod
    def is_valid_position(position):
        valid_positions = ["Manager", "Cashier","Cook", "Janitor"]
        return position in valid_positions
    
    

employee1 = Employee("Eugene", "Manager")
employee2 = Employee("Squidward", "Cashier")
employee3 = Employee("SpongeBob", "Cook")

print(Employee.is_valid_position("Cook"))
print(employee1.get_info())