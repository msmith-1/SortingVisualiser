import random
import matplotlib.pyplot as plt


x = [*range(1,11)]
values = [*range(1,11)]
random.shuffle(values)

plt.bar(x, values)
plt.show()

def insertion(list):
    i = 1
    while i < len(list):
        j = i
        while j > 0 and list[j-1] > list[j]:
            buffer = list[j]
            list[j] = list[j-1]
            list[j-1] = buffer
            j = j-1
        i = i + 1
    return list

sorted = insertion(values)

plt.bar(x, sorted)
plt.show()












