 # Euclidean Algorithm for finding GCD
 The **Euclidean algorithm**, also called **Euclid's algorithm**, is an algorithm for finding the `greatest common divisor` of two numbers `a` and `b`.
 The **Greatest Common Divisor (GCD)** of two integers `a` and `b` is the **largest integer that divides** both `a` and `b`.
 
 Often, GCD is also known as the **Highest Common Factor (HCF)**.
 
 #
### The Algorithm
The Euclidean Algorithm for finding GCD(A, B) is as follows:
* If A = 0 then GCD(A, B) = B, since the GCD(0, B) = B, and we can stop.  
* If B = 0 then GCD(A, B) = A, since the GCD(A, 0) = A, and we can stop.  
* Write A in quotient remainder form (A = B⋅Q + R)
* Find GCD(B, R) using the Euclidean Algorithm since GCD(A, B) = GCD(B, R)
