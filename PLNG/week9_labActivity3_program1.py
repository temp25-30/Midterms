byteMessage = b"Hello Python"


print(byteMessage)
stringMessage = byteMessage.decode()
print(stringMessage)

hexMessage = byteMessage.hex()
print(hexMessage)

print(bytes.fromhex(hexMessage))

byteArray=bytearray(stringMessage, "utf-8")
print(byteArray)

byteArrayed = bytearray(byteMessage)
print(byteArrayed)

print(byteMessage[6:12])

byteArray[0] += 32
byteArray = byteArray.decode()
print(byteArray)
