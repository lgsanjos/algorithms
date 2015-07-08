# Given a linked list return the Kth element from the end, iteratively

class Node
  attr_accessor :next
	attr_accessor :value

	@next = nil
	@value = 0
end

def returnKth(n, k)
  count = 0
	node = n

	while not node.next.nil?
	  count += 1
		node = node.next
	end
end

n1 = Node.new
n1.value = 3

n2 = Node.new
n2.value = 4

n3 = Node.new
n3.value = 0

n1.next = n2
n2.next = n3

p returnKth(n1, 1)
