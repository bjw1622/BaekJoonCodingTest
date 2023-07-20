def solution(numbers):
    answer = []
    # 모든 경우의 수를 찾아서 더하기
    # 이 때 set에 저장해서 중복 방지
    answer_set= set()
    for i in range(len(numbers)):
        for j in range(i+1,len(numbers)):
            answer_set.add(numbers[i]+numbers[j])
    for i in answer_set:
        answer.append(i)
    answer.sort()
    return answer