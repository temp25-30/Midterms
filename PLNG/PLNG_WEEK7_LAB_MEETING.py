def func(*args):
    print("My youngest child is: ", args[1])

func("Emil","Toby","Linus")

def myfunc(*args):
    print("Type: ", type(args))
    print("First Arg: ", args[0])
    print("Second Arg: ", args[1])
    print("All args: ", args)

myfunc("Emil","Toby","Linus")

def incrementer(*numbers):
    total = 0
    for num in numbers:
        total += num
    return total

total = incrementer(10,10,10)
print(total)

def MAXIMUM(*numbers):
    if len(numbers) == 0:
        return None
    maxnum = numbers[0]
    for num in numbers:
        if num > maxnum:
            maxnum = num
    return maxnum

maxi = MAXIMUM(10,10,10,20,40,7,7)
print(maxi)

def kFunc(**kid):
    print("My son's last name is " + kid["lname"])
kFunc(fname="Toby", lname="Refsnes")

def kFuncs(**vars):
    print("Type: ", type(vars))
kFuncs(name="Toby", age=30, city="Bergen")
