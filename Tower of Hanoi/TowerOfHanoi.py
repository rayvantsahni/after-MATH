# TOWER OF HANOI using recursion

moves = 0
def tower_of_hanoi(n, source, dest, temp):
    
    global moves
    
    if n == 1:
        print("Moving disk ", n, " from ", source, " to ", dest)
        moves += 1
        
    else:
        tower_of_hanoi(n-1, source, temp, dest)
        print("Moving disk ", n, " from ", source, " to ", dest)
        tower_of_hanoi(n-1, temp, dest, source)
        moves += 1
        
n = int(input("Enter the number of disks you want\n"))
print("Minimum number of moves required to complete this: ", (2 ** n) - 1, sep = "", end = "\n\n")

tower_of_hanoi(n, "A", "B", "C")
print("\nCompleted in ", moves, " moves.", sep = "")
