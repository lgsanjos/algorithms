require 'test/unit'

def transverse(m)
  size = m.size

  (0..(size-1)).each do |i| 
    (0..(size-1)).each do |j |
      
      s = m[i][j]
      m[i][j] = m[j][i]
      m[j][i] = s

    end  
  end
  p m
  return m
end

def rotate(m)
  size = m.size
  
  m = transverse(m)

  (0..(size-1)).each do |i| 
    (0..(size-1)).each do |j |
   
      a = m[i][j]
      m[i][j] = m[size - 1 -j][i]
      m[size - 1 -j][i] = a
      #0,0   0,1  0,2
      #1,0   1,1  1,2
      #2,0   2,1  2,2
    end
  end
  return m
end

class Bla < Test::Unit::TestCase 
  def test_rotation
    m = [ [1,2,3], [4,5,6], [7,8,9] ] 
    r = rotate m
    a = [ [7,4,1], [8,5,2], [9,6,3] ]

    assert_equal a, m
  end
end
