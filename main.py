import random

import matplotlib.pyplot as plt

x = [*range(1,11)]
y = [*range(1,11)]
random.shuffle(y)

plt.bar(x, y)
plt.show()




