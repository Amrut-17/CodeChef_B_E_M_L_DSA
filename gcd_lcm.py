import math
T = int(input())
for i in range(T):
    a, b = map(int,input().split())
    GCD = math.gcd(a,b)
    LCM = (a*b)//GCD
    print(GCD,LCM)
        
