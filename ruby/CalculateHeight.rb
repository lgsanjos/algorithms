class Node
  attr_accessor :val
  attr_accessor :left
  attr_accessor :right

  def initialize(val=0,left=nil,right=nil)
    @val = val; @left = left; @right = right
  end
end

def print(n)
  o = ""
  print_breadth([n], o)
  puts o
end

def print_breadth(l, output)
  size = l.size - 1 
  for i in (0..size) do
    n = l.shift
    
    output << n.val.to_s
    output << ", " unless i == size

    l << n.left unless n.left.nil?
    l << n.right unless n.right.nil?
  end

  output << "\n"

  print_breadth(l, output) unless l.empty?
end

@lh=0
@rh=0
def height(n)

  unless n.left.nil?
    @lh+=1
    height(n.left)
  end

  unless n.right.nil?
    @rh+=1
    height(n.right)
  end

end

def is_balanced(r)
  height(r)
  return (@lh - @rh).abs <= 1
end

r111 = Node.new(3)
r112 = Node.new(8)
r11 = Node.new(7, r111, r112)

r1 = Node.new(13, r11)
r2 = Node.new(20)
r = Node.new(15, r1, r2)

print(r)
puts "\n\n -- Balanced? -- "
p is_balanced(r)

p @lh
p @rh
