def solution(sizes):
    answer = 0
    big = []
    small = []
    for i in sizes:
        if i[0] > i[1]:
            big.append(i[0])
            small.append(i[1])
        else:
            big.append(i[1])
            small.append(i[0])
    big.sort()
    answer = max(big)*max(small)
    return answer