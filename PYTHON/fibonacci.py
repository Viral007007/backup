def fib(x):
	list = []
	a,b=0,1
	while b<=x:
		list.append(b)
		a,b=b,a+b
	return list
		
print(fib(int(input('enter the number: '))))