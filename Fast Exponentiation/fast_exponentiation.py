def calculate_power(base, power):
    if not power:
        return 1

    if not power % 2:
        return calculate_power(base, power // 2) * calculate_power(base, power // 2)

    else:
        return calculate_power(base, power // 2) * calculate_power(base, power // 2) * base


if __name__ == "__main__":
    a = int(input("Enter base: "))
    n = int(input("Enter exponent: "))
    print("{}^{} = {}".format(a, n, calculate_power(a, n)))