def solution(arr):
    answer = []
    if(len(arr) == 1):
        answer.append(-1)
    else:
        test = sorted(arr)
        target = test[0]
        arr.remove(target)
        answer = arr
    return answer