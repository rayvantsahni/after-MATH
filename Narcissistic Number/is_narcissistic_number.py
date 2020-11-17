def is_narcissistic_number(n):
    original_number = n
    number_of_digits = get_number_of_digits(n)
    sum = 0

    while n != 0:
        sum += (n % 10) ** number_of_digits
        n //= 10

    return original_number == sum


def get_number_of_digits(n):
    return len(str(n))


if __name__ == "__main__":
    n = int(input("Enter number: "))
    print("Is a Narcissistic Number" if is_narcissistic_number(n) else "Is NOT a Narcissistic Number")
