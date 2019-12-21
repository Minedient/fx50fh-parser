import math,mc_bridge as mc

def distance(r,x,y):
    return math.hypot(x-r+0.5,y-r+0.5)
    
bridge_len = int(input("Enter the bridge length: "))
angle = float(input("Enter the arc angle in degree: "))
angle = math.radians(angle)
radius = abs(bridge_len/(2*math.sin(angle/2)))
height = math.ceil(mc.cal_sagitta(bridge_len,angle,radius))

# Get the diameter of the circle and the size of the list
diameter = math.ceil(radius*2)
# Recalculate the radius in order to normalize it to int+-0.5
radius = diameter/2
print("The diameter of the circle required is {d} blocks".format(d = diameter))

square_area = [[0 for x in range(diameter)] for y in range(diameter)]
count_list = [0 for x in range(height)]

for x in range(height):
    for y in range(diameter):
        square_area[x][y] = distance(radius,x,y)
        if square_area[x][y] <= radius:
             count_list[x] +=1

# Because the bridge_len equals to last layer's length
count_list[height-1] = bridge_len
count_list.reverse()

for x in range(height):
    if x !=height-1:
        count_list[x] -= count_list[x+1]
        count_list[x] /= 2
count_list.reverse()

print("\nThe blocks count of the arc required is {c}\n".format(c = count_list))
print("Noticed that each step in the list, the blocks placed should be one step outer,")
print("then and lower the previous layer.")
print("\nThe first layer is a full layer, while the rest of the layer is half layer only")
print("\nReminded that if the list shows 0.0, this means that layer of block have the")
print("same location as the the previous block except being one block lower (Vertical)") 
