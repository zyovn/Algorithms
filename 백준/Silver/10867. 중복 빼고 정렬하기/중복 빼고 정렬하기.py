N = int(input())
n_list = list(map(int, input().split()))

for i in sorted(list(set(n_list))):
    print(i, end=' ')
