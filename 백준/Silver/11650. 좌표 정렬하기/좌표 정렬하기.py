num = int(input())
arr = []
for i in range(num):
    l = list(map(int,input().split(" ")))
    arr.append(l)
arr.sort()
for i in range(len(arr)):
    print(arr[i][0], arr[i][1])