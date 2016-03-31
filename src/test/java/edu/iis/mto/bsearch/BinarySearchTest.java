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
	@Test
	public void whenSequenceLengthOneAndKeyNotInSequenceThenResoultNotFound(){
		int[] sequence = new int[]{3};
		int key = 6;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.isFound(), equalTo(false));
	}
	@Test
	public void whenSequenceLenghtOneAndKeyInSequenceThenResultEqualsMinusOne(){
		int[] sequence = new int[]{3};
		int key = 6;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.getPosition(), equalTo(-1));
	}
	@Test
	public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetIsFirstInSequenceThenResultIsFound(){
		int[] sequence = new int[]{3,5,7,4,2,9};
		int key = 3;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.isFound(), equalTo(true));
	}
	@Test
	public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetIsFirstInSequenceThenKeyIsFound(){
		int[] sequence = new int[]{3,5,7,4,2,9};
		int key = 3;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.getPosition(), equalTo(0));
	}
	@Test
	public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetIsLastInSequenceThenResultIsFound(){
		int[] sequence = new int[]{3,5,7,4,2,9};
		int key = 9;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.isFound(), equalTo(true));
	}
	@Test
	public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetIsLastInSequenceThenKeyIsFound(){
		int[] sequence = new int[]{3,5,7,4,2,9};
		int key = 9;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.getPosition(), equalTo(sequence.length-1));
	}
	
	
}
