def func(*args):
    print("My youngest child is: ", args[1])

func("Emil","Toby","Linus")

def myfunc(*args):
    print("Type: ", type(args))
    print("First Arg: ", args[0])
    print("Second Arg: ", args[1])
    print("All args: ", args)

myfunc("Emil","Toby","Linus")