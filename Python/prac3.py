import turtle

myturtle = turtle.Turtle()


# Square
def square(length, angle):
    myturtle.forward(length)
    myturtle.right(angle)
    myturtle.forward(length)
    myturtle.right(angle)
    myturtle.forward(length)
    myturtle.right(angle)
    myturtle.forward(length)

square(50, 45)
square(100, 45)
square(150, 45)
