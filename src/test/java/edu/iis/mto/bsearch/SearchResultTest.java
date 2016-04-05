/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.bsearch;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Kuba
 */
public class SearchResultTest {
    @Test
    public void isFoundShouldReturnTrueWhenPositionSet(){
        SearchResult result= new SearchResult();
        result.setPosition(5);
        assertThat(result.isFound(), equalTo(true));
    }
    @Test
    public void isFoundShouldReturnFalseWhenPositionMinusOne(){
        SearchResult result= new SearchResult();
        result.setPosition(-1);
        assertThat(result.isFound(), equalTo(false));
    }
    @Test
    public void setPositionShouldUpdatePositionWhenKeyGreaterThanMinusOne(){
        SearchResult result= new SearchResult();
        result.setPosition(6);
        assertThat(result.getPosition(), equalTo(6));
    }
    @Test
    public void setPositionShouldNotChangeWhenKeyLesserThanZero(){
        SearchResult result= new SearchResult();
        assertThat(result.getPosition(), equalTo(-1));
        result.setPosition(-5);
        assertThat(result.getPosition(), equalTo(-1));
    }
}
