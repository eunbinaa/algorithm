def solution(num_list):
    answer = []
    giri=len(num_list)
    for i in range(giri-1, -1, -1):
        answer.append(num_list[i])
    return answer