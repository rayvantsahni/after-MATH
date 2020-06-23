# Golden Ratio
The golden ratio is a special number approximately equal to `1.61803`, but more accurately is represented by ![](https://user-images.githubusercontent.com/38404580/85475870-80fd4e80-b5d4-11ea-9453-125a7734feda.png).

It is denoted `phi`.
It is often also called  as the **golden mean** or **golden section**.
The Golden Ratio is even said to be the *most irrational* number, even more than `pi` and `e`.
If expressed algebraically, it can be written as,

![](https://user-images.githubusercontent.com/38404580/85476668-704dd800-b5d6-11ea-9ec1-8e09901d34e5.png)

It has several applications in the nature...


In this program, we are trying to approximate the Golden Ratio. 
Here, we leverage the fact that the mathematics of the golden ratio and of the Fibonacci sequence are intimately interconnected.

A closed-form expression for the Fibonacci sequence involves the golden ratio:

![](https://user-images.githubusercontent.com/38404580/85476268-8d35db80-b5d5-11ea-81c6-4d1056f32e54.png)

In other words, if a Fibonacci number is divided by its immediate predecessor in the sequence, the quotient approximates φ; e.g., 987/610 ≈ 1.6180327868852. These approximations are alternately lower and higher than φ, and converge to φ as the Fibonacci numbers increase.

More generally:

![](https://user-images.githubusercontent.com/38404580/85476432-e6057400-b5d5-11ea-885f-f4c00ac8c7b2.png)
where, the ratios of consecutive terms of the Fibonacci sequence, is a case when a = 1.

### About the Program -
*The user needs to enter a values for 'n', which will denote the 'n' th term of the series that will act as the denominator for the fraction used to calculate the approx value of the Golden Ratio. The numerator will be taken as the 'n+1' th term of the fibnacci series depending on the value of 'n' entered by the user.
For eg, if the user enters 10 as the value of 'n', then the program will approximate the value of the Golden Ratio by diving the 11th term by the 10th term.*

One important thing to note here is that, **_higher the value of n, more accurate will be our approximation_**.


Just in case any of you wants to view more than 50k digits of the Golden Ratio, you might want to click [here](https://github.com/rayvantsahni/Fun-with-Maths/blob/master/Approximating%20the%20Golden%20Ratio/50%2C640%20Digits%20of%20the%20Golden%20Ratio.md).
