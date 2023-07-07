def solution(progresses, speeds):
    answer = []
    num = 1
    count = 0
    for i in range(len(progresses)):
        while True:
            cal = 100 - progresses[i] - speeds[i] * num
            print(cal)
            if cal>0 and count != 0:
                num += 1
                answer.append(count)
                count = 0
            elif cal > 0:
                num += 1
            elif cal <= 0 and len(progresses)-1 == i:
                count += 1
                answer.append(count)
                break
            else:
                count += 1
                break
    return answer