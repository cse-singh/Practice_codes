import turtle

myturtle = turtle.Turtle()

myturtle.speed(0)

# Square
def square(length, angle):
    for i in range(4):
        myturtle.forward(length)
        myturtle.right(angle)    

for i in range(120):
    square(100, 90)
    myturtle.right(11)
    myturtle.color("blue")
    myturtle.fillcolor("red")
