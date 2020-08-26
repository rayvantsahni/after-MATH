def is_duck_number(s):
    return "0" in str(int(s))


def main():
    s = input("Enter number to check for Duck Number\n")
    print("Is a Duck Number" if is_duck_number(s) else "Is NOT a Duck Number")

main()
