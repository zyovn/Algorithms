n = int(input())
company = set()

for i in range(n):
    person, status = input().split()
    
    if status == "enter":
        company.add(person)
    elif status == "leave":
        company.remove(person)
        
result = list(company)
result.sort(reverse=True)

for i in result:
    print(i)