# =======================================================================
# This algorithm uses a top-down approach of recursion
# and becasue we only need to perform one action here
# for each subsequence, i.e print and not return or store
# it, which would have taken O (2 ^ n) space.
# Hence, we don't need to store the subsequences as
# they are generated. We can simply print a subsequence
# and move forward.
# At each step, we just make a choice of whether to include
# a certain letter or to exclude it, until no letter is 
# left to make a choice for.
# =======================================================================



def print_subsequences(string, output_subsequence = ""):
    if not string:  # checking if there is any character left if the string(is it an empty string or not)
        print(output_subsequence)  # printing the output after no character is left in the string to work upon
        return

    print_subsequences(string[1:], output_subsequence)  # we exclude the first character of the string at hand for the output string and generate subsequences of the rest of the string
    print_subsequences(string[1:], output_subsequence + string[0])  # we include the first character of the string at hand for the output string and generate subsequences of the rest of the string


if __name__ == "__main__":
    string = input("Enter string: ")
    print_subsequences(string)
    
    
    
# For reference: https://www.youtube.com/watch?v=EJwCUCjb9HM
