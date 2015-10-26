require 'test/unit'

class Tryout
  attr_reader :block
  attr_reader :number_of_attempts
  attr_reader :succeded

  def initialize(&block)
    @block = block
    @number_of_attempts = 0
    @succeded = false
  end

  def run_with(params)
  
  end

  def attempt_times(number)
    while not @succeded and @number_of_attempts < number
      @number_of_attempts += 1
      begin
        block.call
        @succeded = true
      rescue
        puts 'except'
      end
    end
  end

  def succeded?
    @succeded
  end
end

class TryoutTest < Test::Unit::TestCase

  def test_it_execute_a_block
    a = 0
    tryout = Tryout.new { a += 1 }

    tryout.attempt_times(3)
    
    assert_equal true, tryout.succeded?
    assert_equal 1, tryout.number_of_attempts
    assert_equal 1, a
  end

  def test_it_fails_two_times
    @count = 0
    def works_on_second_call
      raise 'bla' unless @count == 2
      @count += 1
    end

    tryout = Tryout.new { works_on_second_call }

    tryout.attempt_times(4)
    assert_equal true, tryout.succeded?
    assert_equal 2, tryout.number_of_attempts
  end

end
