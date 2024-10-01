n = list(map(int, input())) #문자열로 입력받고, 리스트로 변환

n.sort(reverse=True)

for i in n:
    print(i, end='')