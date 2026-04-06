# variable scope =  where a variable is visible and accessible 
# scope resolution = (LEGB) Local -> Enclosed -> Global -> Built-in


def func1():
    a = 1    #local variable
    print(a)
    
def func2():
    b = 2
    print(b)
    
func1()
func2()