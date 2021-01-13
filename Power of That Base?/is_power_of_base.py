from math import log

def is_power_of_base(n, base):
    power = log(n, base)
    return int(power) == power

if __name__ == "__main__":
    n = int(input("Enter a number: "))
    base = int(input("Enter a base: "))
    print("{} is{}a power of {}".format(n, " " if is_power_of_base(n, base) else " NOT ", base))