class Node
  attr_accessor :value
  attr_accessor :left
  attr_accessor :right

  def initialize(v = 0, l = nil, r = nil)
    @value = v
    @left = l
    @right = r
  end
end

class AvlTree

   def search(n, v)
     return nil if n.nil?

     return search(n.right, v) if v > n.value
     return search(n.left, v) if v < n.value
     
     return n if v == n.value
   end

   def insert(root, v)
     n = Node.new(v)

     find_right_place = false
     rn = root
     rnp = root
     while not find_right_place do
       if (rn.value > v)
         rnp = rn
         rn = rn.left
       else if (rn.value < v)
         rnp = rn
         rn = rn.right
       end

       is_leaf = rn.left.nil? and rn.right.nil?
       find_right_place = is_leaf
     end

   end
end
