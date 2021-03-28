from datetime import datetime

start = datetime.now()


def fib(n):
    if n < 2:
        return 1
    else:
        return fib(n - 2) + fib(n - 1)


print(fib(36))

end = datetime.now()

a = start
b = end
c = b - a

print(start)
print(end)
print(c)