def solution(n):
    answer = 0

    # n을 2진수로 변환했을 때 1의 갯수
    n_convert = bin(n)
    count_one = 0
    for i in n_convert:
        if i == "1":
            count_one += 1
    
    # 해당 타겟을 찾을 때 까지 무한 반복
    while True:
        target = n + 1
        targtet_convert = bin(target) 
        # 만약 1의 갯수가 같으면 break
        target_count_one = 0
        
        for i in targtet_convert:
            if i == "1":
                target_count_one += 1
        
        if count_one == target_count_one:
            answer = target
            break
        # 만약 1의 갯수가 같지 않으면 다음 수 반복
        else:
            n += 1
    return answer