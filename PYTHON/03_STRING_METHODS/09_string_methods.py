#String methods = are built in functions used to manipulate and work with text(strings)
#They don't change the original string-each method returns a new one


# # name = input("Enter Your Full Name:")
# phone_number = input("Enter Your Phone Number#: ")

# result = len(name)
# result = name.find("I")
# result = name.rfind("i")
# name = name.capitalize()
# name = name.upper()
# name = name.lower()
# result = name.isdigit()
# result = name.isalpha()

# # result = phone_number.count("_")
# result = phone_number.replace("_"," ")
# print(result)


#? Exercise one: validate user input
# 1. username is no more than 12 characters
# 2. username must not contain spaces
# 3.username must not contain digits

username = input("Enter a username:")

if len(username) > 12:
    print("username should be less than 12")
elif not username.find(" ") == -1:
    print("Your username can't contain spaces")
elif not username.isalpha():
    print("Your username can't contain digits")
else:
    print(f"Welcome {username}")


