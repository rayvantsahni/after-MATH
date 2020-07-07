# Let the total number of people be n
# And the safe position be s.
# Now, rewrite n in the form (2^m + l)
# Then, the safe position s will (2l + 1).

import math

n = int(input("Enter the total number of people:\n"))
l = n - pow(2, math.floor(math.log2(n)))
safe = (2 * l) + 1

print("Person at position ", safe, " will be safe.", sep = '')
