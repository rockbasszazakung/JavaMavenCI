package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

import junit.framework.Assert;

public class CalculateTest {
	
	public int score;
	public Calculate cal;

	@Before
	public void initScoreZero() {
		this.score = 0;
	}
	@Before
	public void initCalculateClass() {
		this.cal = new Calculate();
	}
	
	@Test
	public void getScoreFromSetScoreByScore100() {
		this.score = 100;
		
		int expected = 100;
		
		cal.setScroe(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getScoreFromSetScoreByScore0() {
		this.score = 0;
		
		int expected = 0;
		
		cal.setScroe(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void gradeAFromSetScoreAndCalculateByScore100() {
		this.score = 100;
		
		String expected = "A";
		
		cal.setScroe(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void gradeAFromSetScoreAndCalculateByScore80() {
		this.score = 80;
		
		String expected = "A";
		
		cal.setScroe(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void gradeBBFromSetScoreAndCalculateByScore75() {
		this.score = 75;
		
		String expected = "B+";
		
		cal.setScroe(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void gradeBFromSetScoreAndCalculateByScore70() {
		this.score = 70;
		
		String expected = "B";
		
		cal.setScroe(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void gradeCCFromSetScoreAndCalculateByScore65() {
		this.score = 65;
		
		String expected = "C+";
		
		cal.setScroe(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void gradeCFromSetScoreAndCalculateByScore60() {
		this.score = 60;
		
		String expected = "C";
		
		cal.setScroe(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void gradeDDFromSetScoreAndCalculateByScore55() {
		this.score = 55;
		
		String expected = "D+";
		
		cal.setScroe(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void gradeDFromSetScoreAndCalculateByScore50() {
		this.score = 50;
		
		String expected = "D";
		
		cal.setScroe(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void gradeFFromSetScoreAndCalculateByScore40() {
		this.score = 40;
		
		String expected = "F";
		
		cal.setScroe(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);

	}
}
