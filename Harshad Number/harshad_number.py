def is_harshad_number(n):
    sum_of_digits = get_sum_of_digits(n)
    return n // sum_of_digits == n / sum_of_digits


def get_sum_of_digits(n):
    sum = 0

    while n != 0:
        sum += n % 10
        n //= 10
    return sum


if __name__ == "__main__":
    n = int(input("Enter number: "))
    print("Is a Harshad Number" if is_harshad_number(n) else "Is NOT a Harshad Number")