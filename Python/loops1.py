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

for i in range(4):
    square(100, 90)
    
