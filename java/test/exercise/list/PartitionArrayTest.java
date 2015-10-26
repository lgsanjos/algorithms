package exercise.list;

import org.junit.Before;
import org.junit.Test;

public class PartitionArrayTest {

	PartitionArray p;
	
	@Before
	public void setup() {
		p = new PartitionArray();
	}
	
	@Test
	public void part1() {
		int[] a = {18, 10, 9, 1, 18, 11, 1, 0, 66, 6, 25};
		p.sortOut(a);
	}
}
