def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)
        

def main():
    from functools import reduce
    numbers = list(map(float, input("Enter the numbers space separated\n").split()))
    print("\nGCD:", reduce(gcd, numbers))
    
main()
