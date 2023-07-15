def solution(s):
    arr = []
    answer = True
    for i in range(len(s)):
        if(s[i] == ')'):
            if(len(arr) == 0):
                answer = False
                break
            elif(arr.pop() == "("):
                continue
            else:
                print(arr.pop())
                answer = False
                break
        else:
            arr.append(s[i])
    if(len(arr) != 0 ):
        answer = False
    print(answer)
    return answer