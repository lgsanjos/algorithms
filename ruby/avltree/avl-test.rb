require 'test/unit'
require './avl.rb'

class AvlTest < Test::Unit::TestCase

  def test_create_avl_tree
     n = Node.new
     n.value = 10
     n.left = Node.new
     n.right = Node.new
     
     assert_equal 10, n.value
     assert_not_nil n.left
     assert_not_nil n.right
  end

  def test_binary_search
    n = Node.new(2)
    n1 = Node.new(3, n)
    n2 = Node.new(6)
    n3 = Node.new(5, n1, n2)
    
    assert_equal n, AvlTree.new.search(n3, 2)
    assert_equal n2, AvlTree.new.search(n3, 6)
    assert_nil AvlTree.new.search(n3, 7)
  end

  def test_insert_no_rotation
    n = Node.new(2)
    n1 = Node.new(4)

    AvlTree.new.insert(n1, n)
    
    assert_equal n, AvlTree.new.search(n1, 4)
    assert_equal n1, AvlTree.new.search(n1, 2)

    assert_nil n1.right
    assert_equal n, r1.left
    assert_nil n.left
    assert_nil n.right
  end
end
