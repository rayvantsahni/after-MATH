def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)
    
    
    
def main():
    a = int(input("Enter 1st number "))
    b = int(input("Enter 2nd number "))
    
    print("\nGCD of {0} and {1} is {2}.".format(a, b, gcd(a, b)))
    
main()
