# Number of Digits in the Factorial of a Number
Finding the numbre of digits in the factorial of a number doesn't seem to hard but it does pose a problem if we think about it. Factorials tend to increment very rapidly as the number increases, and hence need a lot of memory to be stored. 

![image](https://user-images.githubusercontent.com/38404580/86520416-ab1b0000-be61-11ea-82a3-20dd5a4488b2.png)

If in case, we were able to get the factorial it would be easy to find the number of digits in that number. 

But as the aforementtioned issue exists, we need another approach..

If we try an observe,

We can find that whenever we find the log10 of a number, we get the result as the number of digits in the number - 1.
So for instance, we have log10 (1000) = 3 [it is clear here that the relation holds True for this case as the number of digits in 1000 is 4 and its log10 gives 3, which indeed is one less than the number of digits]
Well, we can leverage this feature.

Now we need to find the number of digits in n!.

So, in other words we need to find the log10 of n! and then add 1 to it.

We know,
## n! = 1 . 2 . 3 . 4 . 5 ......... n-2 . n-1 . n

Hence,
## log10(n!) = log10(1 . 2 . 3 . 4 . 5 ......... n-2 . n-1 . n)

But we know, **log10(a * b) = log10(a) + log10(b)**

Therefore, we can write
## log10(n!) = log10(1) + log10(2) + log10(3) + log10(4) + ............. + log10(n-2) + log10(n-1) + log10(n)

And hence, the number of digits in the factorial of any number 'n' is
## log10(1) + log10(2) + log10(3) + log10(4) + ............. + log10(n-2) + log10(n-1) + log10(n) + 1
