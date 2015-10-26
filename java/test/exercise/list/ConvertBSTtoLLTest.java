package exercise.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ConvertBSTtoLLTest {
	
	private ConvertBSTtoLL converter;

	@Before
	public void setup() {
		converter = new ConvertBSTtoLL();
	}
	
	@Test
	public void convert3NodeTree() {
		
		ConvertBSTtoLL.Tree rootL = new ConvertBSTtoLL.Tree();
		rootL.value = 2;
		ConvertBSTtoLL.Tree rootR = new ConvertBSTtoLL.Tree();
		rootR.value = 6;
		ConvertBSTtoLL.Tree root = new ConvertBSTtoLL.Tree();
		root.value = 5;
		root.left = rootL;
		root.right = rootR;
		
		ConvertBSTtoLL.Node head = converter.treeToList(root);
		
		assertEquals(2, head.value);
		assertEquals(5, head.next.value);
		assertEquals(6, head.next.next.value);
		assertNull(head.next.next.next);
	}

}
