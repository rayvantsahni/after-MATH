def get_narcissistic_numbers(n):
    start = 10 ** (n - 1)
    end = 10 ** n

    narcissistic_numbers = []

    for number in range(start, end):
        if number == sum_of_powered_digits(number, n):
            narcissistic_numbers.append(number)

    if narcissistic_numbers:
        return narcissistic_numbers
    else:
        return [None]


def sum_of_powered_digits(number, number_of_digits):
    sum = 0

    while number != 0:
        sum += (number % 10) ** number_of_digits
        number //= 10

    return sum


if __name__ == "__main__":
    n = int(input("Enter some value of n: "))
    print("Narcissistic Numbers for n = {} are:\n{}".format(n, get_narcissistic_numbers(n)))