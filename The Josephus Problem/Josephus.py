import math

n = int(input("Enter the total number of people:\n"))
l = n - pow(2, math.floor(math.log2(n)))
safe = (2 * l) + 1

print("Person at position ", safe, " will be safe.", sep = '')
