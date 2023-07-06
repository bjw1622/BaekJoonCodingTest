def x(arr):
    return arr[1]


num = int(input())
arr = []
for i in range (num):
    l = list(map(int,input().split(" ")))
    arr.append(l)
arr.sort()
arr = sorted(arr, key=x)
for i in range(len(arr)):
    print(arr[i][0],arr[i][1])

