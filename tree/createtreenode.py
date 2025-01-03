class Node:
	def __init__(self,data):
		self.left=None;
		self.data=data;
		self.right=None;
class Tree:
	def createNode(self,data):
		return Node(data)
	def insertdata(self,node,data):
		if node is None:
			return self.createNode(data)
		if data < node.data:
			node.left=self.insertdata(node.left,data)#node.left is none so will create new node with data
		else:
			node.right=self.insertdata(node.right,data)
		return node
	def inorder_traverse(self,root):
		if root is not None:
			self.inorder_traverse(root.left)
			print(root.data)
			self.inorder_traverse(root.right)
	def max_height(self,root):
		if root is None:
			return -1
		return max(self.max_height(root.left),self.max_height(root.right))+1
	def min_height(self,root):
		if root is None:
			return -1
		return min(self.min_height(root.left),self.max_height(root.right))+1
c1=Tree()
root=c1.createNode(3)
c1.insertdata(root,9)
c1.insertdata(root,20)
c1.insertdata(root,15)
c1.insertdata(root,17)
#c1.insertdata(root,120)
#c1.inorder_traverse(root)
print(c1.max_height(root))
print(c1.min_height(root))

