t = int(input())
for i in range(t):
    n = int(input())
    num = n
    reverse = 0
    while n > 0 :
        digit = n%10
        reverse = (reverse*10) + digit
        n = n // 10
    if (num == reverse):
        print ('wins')
    else :
        print('loses')
