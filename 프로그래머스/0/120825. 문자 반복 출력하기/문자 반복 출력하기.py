def solution(my_string, n):
    answer = []
    for i in my_string :
        answer.append(i*n)
        '''
       join: answer 배열 요소를 다 이어서 하나의 요소로 만듦
        '''
    return ''.join(answer)