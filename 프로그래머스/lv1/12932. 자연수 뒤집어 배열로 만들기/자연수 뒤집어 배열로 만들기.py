def solution(n):
    answer = []
    test = str(n)
    test_arr=[]
    for i in test:
        test_arr.append(int(i))
    answer = list(reversed(test_arr))
    return answer