import random
f = open('laba2/main.txt', 'w')

days = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
p = ['','','','','','','','','','']
line = ''
for i in range(6):
    line = ''
    line = line + f'{random.randint(10, 200)}.{random.randint(100,300)}.{random.randint(10, 999)}.{random.randint(10, 200)}'
    p[i] = line
    line = line + f' {random.randint(0, 24)}:{random.randint(0, 60)}:{random.randint(0, 60)}'
    line = line + f' {days[random.randint(0,6)]}'
    f.write(line + '\n')

for i in range(10):
    line = p[random.randint(0, 3)]
    line = line + f' {random.randint(0, 24)}:{random.randint(0, 60)}:{random.randint(0, 60)}'
    line = line + f' {days[random.randint(0,6)]}'
    f.write(line + '\n')
