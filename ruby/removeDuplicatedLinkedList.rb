class Node
  attr_accessor :next
	attr_accessor :value

	@next = nil
	@value = 0
end

@a = Hash.new

def removeDuplicate(n, pn = nil)
  @a[n.value] ||= 0 
  @a[n.value] += 1


	if @a[n.value] > 1
		@a[n.value] -= 1
		pn.next = n.next
    removeDuplicate(n.next, pn) unless n.next.nil?
	else
   	removeDuplicate(n.next, n) unless n.next.nil?
  end

end

@out = Array.new
def print(n)
	@out << n
	print(n.next) unless n.next.nil?
end

a1 = Node.new
a1.value = 5

a2 = Node.new
a2.value = 7

a3 = Node.new
a3.value = a1.value 

a4 = Node.new
a4.value = a2.value 


a1.next = a2
a2.next = a3
a3.next = a4 

#print a1
removeDuplicate(a1)

print a1
p @out.map(&:value)
