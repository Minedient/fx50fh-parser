import math

def cal_sagitta(bridge_len,angle,radius):
    return radius - math.sqrt(radius*radius -(bridge_len/2)*(bridge_len/2))

#d = int(input("Enter the bridge length:"))
#t = float(input("Enter the arc angle in degree:"))
#s = cal_sagitta(d,t)

#arc = r*t

#print("Radius = {rad} blocks".format(rad = r))
#print("Arc height = {sag} blocks".format(sag = s))
#print("Arc length = {arcl} blocks".format(arcl = arc))
#print("Remember that arc height doesn't count the base layer.")
