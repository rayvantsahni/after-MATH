# lets try to find an approximate value value of pi
# Higher the value of n, closer will be value to the actual value of pi
# In other words, more the number of iterations, closer we get to the actual value of pi

import math

n = int(input('Enter a value for n:\n'))
pi = 3

for i in range(1, n+1):
    pi = pi + (((-1)**(i+1)) * (4)) / ((i*2) * ((i*2) + 1) * ((i*2) + 2))   
    print("Iteration ", i, ":\n", pi, sep = "")
    
print("\nThe absolute difference between the actual value of pi and your approximated pi is:", abs(math.pi - pi))
