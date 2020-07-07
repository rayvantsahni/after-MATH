def hosoya(n, r):
    if (n,r) == (0,0) or (n,r) == (1,0) or (n,r) == (2,1) or (n,r) == (1,1):
        return 1
    return hosoya(n-1, r) + hosoya(n-2, r) if r <= n//2 else hosoya(n-1, r-1) + hosoya(n-2, r-2)


n = int(input("Enter the number of rows of the Hosoya's Triangle\n"))

for i in range(n): 
    print(*[(hosoya(i, j)) for j in range(i+1)], end = "\n")
    
# [print(*[(hosoya(i, j)) for j in range(i+1)], end = "\n") for i in range(10)]
