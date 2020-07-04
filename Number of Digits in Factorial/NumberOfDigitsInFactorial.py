import math
n = int(input("Enter the number "))

print("\nThe factorial is:", math.factorial(n), sep = "\n")
# NOTE - Finding the factorial of the number is note neccessary for this program to work.
# We are only printing out the factorial for reference, no other reason.

sum = .0
for i in range(n):
    sum = sum + math.log10(i+1)
    
print("\nNumber of digits is", math.floor(sum) + 1)
