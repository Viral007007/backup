
x = []	
i = 1
while True:
	while True:
		x.append(f'viral : {i}')
		break
	file = open(f'VIRAL{i}.txt','a+')
	file.write(str(x))
	i += 1
