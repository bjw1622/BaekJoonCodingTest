def solution(prices):
# answer = []
# prices = [1, 2, 3, 2, 3, 3, 1]
# # 갯수 만큼 돌릴게
# for i in range (len(prices)):
#     # 타겟은 항상 0인데 그 리스트에서 min이 타겟의 값과 일치한다면 answer에 갯수 -1 추가
#     if(prices[0] == min(prices)):
#         answer.append(len(prices) - 1)
#         prices.pop(0)
#     # 일치하지 않는다면 for문으로 값 비교
#     else:
#         for j in range(1,len(prices)):
#             if(prices[0] > prices[j]):
#                 answer.append(j)
#                 prices.pop(0)
#                 break
# print(answer)
    result = []
    for i in range(len(prices)):
        count = 0
        for j in range(i+1, len(prices)):
            if prices[i] <= prices[j]:
                count += 1
            else:
                count += 1
                break
        result.append(count)
    return result
