# cook your dish here
t = int(input())
for i in range(t):
    a = input()
    if(a[0] == '1'):
        print(a[0]+'0'+a[1:])
    else:
        print('1'+ a)