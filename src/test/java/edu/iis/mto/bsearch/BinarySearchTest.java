package edu.iis.mto.bsearch;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import java.lang.IllegalArgumentException;

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
		int[] sequence = new int[]{2,3,4,5,7,9};
		int key = 2;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.isFound(), equalTo(true));
	}
	@Test
	public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetIsFirstInSequenceThenKeyIsFound(){
		int[] sequence = new int[]{2,3,4,5,7,9};;
		int key = 2;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.getPosition(), equalTo(0));
	}
	@Test
	public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetIsLastInSequenceThenResultIsFound(){
		int[] sequence = new int[]{2,3,4,5,7,9};
		int key = 9;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.isFound(), equalTo(true));
	}
	@Test
	public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetIsLastInSequenceThenKeyIsFound(){
		int[] sequence = new int[]{2,3,4,5,7,9};
		int key = 9;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.getPosition(), equalTo(sequence.length-1));
	}
	@Test
	public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetIsMiddleInSequenceThenResultIsFound(){
		int[] sequence = new int[]{2,3,4,5,7,9,66};
		int key = 5;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.isFound(), equalTo(true));
	}
	@Test
	public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetIsMidlleInSequenceThenKeyIsFound(){
		int[] sequence = new int[]{2,3,4,5,7,9,66};
		int key = 5;
		SearchResult result = BinarySearch.search(key, sequence);
		assertThat(result.getPosition(), equalTo(sequence.length/2));
	}
        @Test
        public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetNotInSequenceThenResultIsNotFound(){
                int[] sequence = new int[]{2,3,4,5,7,9,66};
                int key = 10;
                SearchResult result = BinarySearch.search(key, sequence);
                assertThat(result.isFound(), equalTo(false));
        }
        @Test
        public void WhenSequenceLengthGreaterThanOneAndSearchedElemenetNotInSequenceThenKeyIsNotFound(){
                int[] sequence = new int[]{2,3,4,5,7,9,66};
                int key = 10;
                SearchResult result = BinarySearch.search(key, sequence);
                assertThat(result.getPosition(), equalTo(-1));
        }
	@Test(expected=IllegalArgumentException.class)
        public void WhenSequenceEmptyThanThrowIllegalArgumentException(){
                int[] sequence = new int[]{};
                int key = 10;
                BinarySearch.search(key, sequence);
        }
       
}
