firstName = input("First Name: ")
lastName = input("Last Name: ")
fullName = firstName + " " + lastName
print("Full name:",fullName)
print("First Character:", firstName[0])
print("Last Character:",lastName[len(lastName)-1])

try:
    firstName[0] ="D"
except TypeError:
    print("Strings are immutable; individual characters cannot be changed directly.")
except:
    print("An unexpected exception happend.")

newFirstName = "D"+firstName[1:]
print("New name:",newFirstName)
print("Original name:",firstName)

for char in fullName:
    print(char)
firstNameLen = len(firstName)

print(fullName[0:firstNameLen])
print(fullName[firstNameLen+1:len(fullName)])

charToFind = input("Enter one character to search: ")

idx = 0
found = False
for char in fullName:
    if char == charToFind:
        print("Character found at index:",idx)
        found = True
    idx+=1
if found == False:
    print("No characters found.")

print("The blank line between", fullName[firstNameLen-1] ,"and", fullName[(len(fullName)-len(lastName))] ,"is the space in",fullName)