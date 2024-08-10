def solution(numbers, n):
    answer = 0
    for i in numbers :
        if answer>n:
            break
        else:
            answer=answer+i
    return answer