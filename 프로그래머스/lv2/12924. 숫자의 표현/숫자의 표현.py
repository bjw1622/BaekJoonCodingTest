def solution(n):
    answer = 1
    for i in range(1, n//2 + 1):
        count = 0
        for j in range(i, n+1): 
            count += j 
            if count == n: 
                answer += 1
                break
            elif count > n: 
                break 
            else: 
                continue
    return answer