def say() : print("Haha!")*

def inc(x) : 
    return x+1

def add (x, y):
    return x+y

def maxThree(x, y, z):
    if x<y:
        if z<y:
            return y
        else:
            return z
    elif z<x:
        return x
    else:
        return z

FibNumbers = [0,1]

def fib(n):
    if n<0:
        print("incorrect")
    elif n <= len(FibNumbers):
        return FibNumbers[n-1]
    else:
        new_fib=fib(n-1)+fib(n-2)
        FibNumbers.append(new_fib)
        return new_fib

def palindrom
