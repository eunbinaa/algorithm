import math
def solution(price):
    answer = 0
    if (price < 100000):
        answer=price
    else:
        if(price>=500000):
             answer=math.floor(price*0.8)
        elif (price>=300000):
             answer=math.floor(price*0.9)
        elif(price>=100000) :
             answer=math.floor(price*0.95)   
    return answer