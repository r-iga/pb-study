n = int(input())
listA = [int(input()) for i in range(n)]
#print(listA)

s = 0

for j in listA:
    s += j

a = s // len(listA)

maxi = max(listA)

mini = min(listA)

print(s, a, maxi, mini)
