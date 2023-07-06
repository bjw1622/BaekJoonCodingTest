a,b = map(int,input().split())
arr1 = []
arr2 = []
answer = []
for i in range(a):
    l = list(map(int,input().split()))
    arr1.append(l)

for i in range(a):
    l2 = list(map(int,input().split()))
    arr2.append(l2)

for i in range(a):
    arr3 = []
    for j in range(b):
        arr3.append(arr1[i][j]+arr2[i][j])
    answer.append(arr3)
for i in range (len(answer)):
    for j in range(len(answer[0])):
        print(answer[i][j],end=" ")
    print()