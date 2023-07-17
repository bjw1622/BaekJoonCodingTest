def solution(array, commands):
    answer = []
    for i in commands:
        first = i[0]-1
        second = i[1]
        target = i[2]-1
        newArr = array[first:second]
        newArr.sort()
        answer.append(newArr[target])
    return answer