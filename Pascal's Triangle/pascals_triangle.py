n = int(input("How many rows of the Pascal Triangle do you want?\n"))

row = [1]

for q in range(n):
    print(*row, sep = " ", end = "\n")
    
    temp = []
    temp.insert(0, row[0])
    temp.insert(-1, row[0])
    
    [temp.insert(i, row[i-1] + row[i]) for i in range(1, len(row))]
    row = temp[:]
