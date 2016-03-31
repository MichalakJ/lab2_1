package edu.iis.mto.bsearch;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;


import org.junit.Test;

public class BinarySearchTest {


	@Test
	public void whenSequenceLenghtOneAndKeyInSequenceThenResultFound() {
		int[] sequence = new int[]{3};
		int key = 3;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.isFound(), equalTo(true));
	}

	@Test
	public void whenSequenceLenghtOneAndKeyInSequenceThenResultEqualsKey(){
		int[] sequence = new int[]{3};
		int key = 3;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.getPosition(), equalTo(0));
	}
}
