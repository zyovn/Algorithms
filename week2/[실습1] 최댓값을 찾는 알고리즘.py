# 1번을 해보세요!
def find_max( A ): 
    max = A[0]
    for i in range(len(A)):
        if A[i] > max:
            max = A[i]
    return max

# 2번을 해보세요!
array = list(map(int, input().split()))

# 출력합니다!
print(array, "최댓값=", find_max(array))
