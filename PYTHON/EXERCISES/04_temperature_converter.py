# Python Temperature converter

unit = input("Is the temperature in Celsius or Fahrenheit (C/F): ")
temp = float(input("Enter the temperature: "))

if unit == "C":
    temp = round((temp * 9) / 5 + 32, 1)
    print(f"The Temperature in Fahrenheit is: {temp} F")
elif unit == "F":
    temp = round((temp - 32) * 5 / 9, 1)
    print(f"The Temperature in Celsius is: {temp} C")
else:
    print(f"{unit} Not a valid unit!")