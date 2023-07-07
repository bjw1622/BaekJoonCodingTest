num = int(input())
arr = []
answer = []
for i in range(num):
    arr.append(int(input()))
for i in range(len(arr)):
    if arr[i] == 0:
        answer.pop()
    else:
        answer.append(arr[i])
print(sum(answer))
