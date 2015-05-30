class Node
  attr_accessor :next
	attr_accessor :value

	@next = nil
	@value = 0
end

@a = 0;
@lastest = 0;
@found = -1;

def get(n, k)
  @a += 1

	get(n.next, k) unless n.next.nil?
  @latest = @a if n.next.nil?

  @found = n.value if (@latest - @a) == k
  @a -= 1
	
end

n1 = Node.new
n1.value = 3

n2 = Node.new
n2.value = 4

n3 = Node.new
n3.value = 0

n1.next = n2
n2.next = n3

get(n1, 1)
p @found
