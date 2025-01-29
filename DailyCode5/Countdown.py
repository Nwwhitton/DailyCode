while True:
    try:
        number = int(input("Type a number here: "))
        break
    except ValueError:
        print("Please enter a valid number: ")


def countdown():
    for i in range(number):
        print(number-i)

countdown()
