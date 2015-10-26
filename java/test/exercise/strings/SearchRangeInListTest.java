package exercise.strings;

import static java.lang.Integer.valueOf;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SearchRangeInListTest {

	private SearchRangeInList search;
	@Before
	public void setup() {
		search = new SearchRangeInList();
	}
	
	@Test
	public void bsearch_empty_list() {
		int[] a = {};
		int pos = search.bsearch(a, 0);
		assertEquals(valueOf(-1), valueOf(pos));
	}
	
	@Test
	public void bsearch_one_element_not_found() {
		int[] a = {4};
		int pos = search.bsearch(a, 2);
		assertEquals(valueOf(-1), valueOf(pos));
	}

	
	@Test
	public void bsearch_one_element() {
		int[] a = {2};
		int pos = search.bsearch(a, 2);
		assertEquals(valueOf(0), valueOf(pos));
	}
	
	@Test
	public void bsearch_even_elements() {
		int[] a = {0, 1, 2, 3};
		int pos = search.bsearch(a, 2);
		assertEquals(valueOf(2), valueOf(pos));
	}
	
	@Test
	public void bsearch_odd_elements() {
		int[] a = {0, 1, 3 ,4, 5};
		int pos = search.bsearch(a, 5);
		assertEquals(valueOf(4), valueOf(pos));
	}

	@Test
	public void bsearch_odd_elements_search_mid() {
		int[] a = {0, 1, 3 ,4, 5};
		int pos = search.bsearch(a, 3);
		assertEquals(valueOf(2), valueOf(pos));
	}
	
	@Test
	public void bsearch_duplicate_elements() {
		int[] a = {0, 1, 2, 3, 4 , 4, 5};
		int pos = search.bsearch(a, 4);
		assertEquals(valueOf(5), valueOf(pos));
	}
	
	@Test
	public void fsearch_duplicate_elements() {
		int[] a = {0, 1, 2, 3, 4 , 4, 5};
		int pos = search.fsearch(a, 4);
		assertEquals(valueOf(5), valueOf(pos));
		
	}
}
