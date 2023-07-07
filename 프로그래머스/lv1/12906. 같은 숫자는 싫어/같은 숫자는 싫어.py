def solution(arr):
    answer = [arr[0]]
    target = arr[0]
    for i in range(len(arr)):
        if arr[i] == target:
            pass
        else:
            target = arr[i]
            answer.append(target)
    return answer