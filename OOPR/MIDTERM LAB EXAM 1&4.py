#Program 1 Library Book Management
class Book():
    def __init__(self, title, author,price):
        self.title = title
        self.author = author
        self.price = price

    def __str__(self):
        return (f"Book: {self.title} | Author: {self.author}\nPrice: PHP {self.price}")

class Ebook(Book):
    def __init__(self,title, author,price,fileSize):
        super().__init__(title, author,price)
        self.fileSize = fileSize
    def __str__(self):
        return (f"Ebook: {self.title} | Author: {self.author}\nPrice: PHP {self.price} | File Size: {self.fileSize} MB")

#Program 4 Online Store Product System
class Product():
    def __init__(self, productName , price):
        self.productName = productName
        self.price = price
        
    def __str__(self):
        return(f"Product Name: {self.productName}\nPrice: PHP {self.price}")
    
class ElectronicDevice(Product):
    def __init__(self, productName , price, warrantyMonths):
        super().__init__(productName , price)
        self.warrantyMonths = warrantyMonths

    def __str__(self):
        return(f"{super().__str__()}\nWarranty: {self.warrantyMonths} Months")

class Laptop(ElectronicDevice):
    def __init__(self, productName , price, warrantyMonths, ramGB, storageGb):
        super().__init__(productName , price, warrantyMonths)
        self.ramGB =ramGB
        self.storageGB =storageGb
    def __str__(self):
        return(f"{super().__str__()}\nRAM: {self.ramGB} GB\nStorage: {self.storageGB} GB")

def main():
    #Program 1
    book1 = Book("Alice's Adventures in Wonderland", "Lewis Caroll", 200.00)
    ebook1 = Ebook("The Wizard of OZ","Frank Baum",150.00, 67)
    ebook2 = Ebook("The War of the Worlds", "H.G. Wells", 299.00, 100)

    books = [book1,ebook1,ebook2]
    for book in books:
        print(book,"\n")

    #Program 4
    laptop1 = Laptop("Dell Latitude 3490", 10000.00, 36, 8, 256)
    laptop2 = Laptop("Lenovo Thinkpad E14", 20000.00, 24, 16, 512)

    laptops = [laptop1,laptop2]
    for laptop in laptops:
        print(laptop, "\n")

if __name__ == "__main__":
    main()
