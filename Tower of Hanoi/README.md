# Tower Of Hanoi

The Tower of Hanoi, is an mathematical problem which consists of three rods and multiple disks
The objective of the game is to move the stack of disks from the leftmost stack to any one particular remaining stack.

Legend has it that somewhere in Asia, monks are solving this problem with a set of 64 disks, and—so the story goes—the monks believe that once they finish moving all 64 disks from the source peg to destination peg according to the two rules of the Tower of Hanoi, **the world will end**.

The game follows 2 rules:
* Only one disk can be moved at a time.
* No disk may be placed on top of a smaller disk.

![image](https://user-images.githubusercontent.com/38404580/85957308-ede46000-b9a9-11ea-9037-1c681c310e93.png)
![image](https://user-images.githubusercontent.com/38404580/85957330-11a7a600-b9aa-11ea-899c-c4f026376dd6.png)

The 1st image is our initial state and 2nd image is the goal state.

If we have *n* number of disks, then the minimum number of moves required to reach our goal state is `(2 ^ n) - 1`.

If we talk about the monks again.... They're using n = 64 disks, and so they will need to move a disk (2 ^ 64) - 12 times. Assuming these monks are nimble and strong and they can move one disk every second, night and day.
How long is (2 ^ 64) - 12 seconds? Using the rough estimate of 365.25 days per year, that comes to `584,542,046,090.6263 years`. That's 584+ billion years. The sun has only about another five to seven billion years left before it goes all supernova on us. So, yes, the world will end, but no matter how tenacious the monks may be, it will happen long before they can get all 64 disks to where they are supposed to be.

In this program , we are taking 3 stacks - `A`, `B` and `C`, where 
* A -> *source stack*
* B -> *destination stack*
* C -> a *temporary stack*
