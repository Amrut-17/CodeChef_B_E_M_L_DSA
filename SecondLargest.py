T = int(input())
total = 0
for i in range(T):
    a, b, c = map(int, input().split())
    total = a+b+c
    print(total-max(a,b,c)-min(a,b,c))
