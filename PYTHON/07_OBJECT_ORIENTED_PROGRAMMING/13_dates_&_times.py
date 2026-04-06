import datetime

date = datetime.date(2023,10, 3)
today = datetime.date.today()
time = datetime.time(16,37,0)
now = datetime.datetime.now()
now  = now.strftime("%H:%M:%S %d-%m-%Y")


print(date)
print(today)
print(time)
print(now)