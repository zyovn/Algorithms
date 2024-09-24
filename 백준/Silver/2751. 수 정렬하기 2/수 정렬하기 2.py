import sys

n = int(input())
list = []

for i in range(n):
    list.append(int(sys.stdin.readline())) #시간 초과로 인해서 sys.stdin.readline() 사용
list.sort()

for i in list:
    print(i)
