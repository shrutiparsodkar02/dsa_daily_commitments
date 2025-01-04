class queue:
	def __init__(self):
		self.value=[]
	def enqueue(self,x):
		self.value.append(x)
	def deque(self):
		front=self.value[0]
		self.value=self.value[1:]
		return front
q1=queue()#create empty queue
q1.enqueue(10)
q1.enqueue(104)
q1.enqueue(108)
q1.enqueue(101)
print(q1.value)
print(q1.deque())
print(q1.value)
