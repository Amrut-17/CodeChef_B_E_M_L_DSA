# t = int(input())
# count = 0
# z = int(0)
# for i in range(t):
#     students = int(input())
#     a,b,c = map(int,input().split())
#     ta,tb,tc = map(int,input().split())
#     if(ta<=(a-0)):
#         count += 1
#     if(tb<=(b-a)):
#         count += 1
#     if(tc<=(c-b)):
#         count += 1
#     print(count)
#     count = 0

t = int(input())
count = 0
for i in range(t):
    students = int(input())
    a = list(map(int,input().split()))
    a.insert(0,0)
    b = list(map(int,input().split()))
    for j in range(students):
        if(b[j]<=a[j+1]-a[j]):
            count += 1
    print(count)
    count = 0
