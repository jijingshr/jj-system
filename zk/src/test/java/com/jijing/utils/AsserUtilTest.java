package com.jijing.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import javax.swing.text.Position.Bias;

import org.junit.Test;

public class AsserUtilTest {

	@Test
	public void testIsTrue() throws CMSException{
		String a="aa";
		String b="aa";
		AsserUtil.isTrue(a.equals(b),"这个是假的");
	}

	@Test
	public void testIsFalse() throws CMSException {
		AsserUtil.isFalse(1>-1,"这个是真的");
	}

	@Test
	public void testNotNull() {
	
	}

	@Test
	public void testIsNull() {
	}

	@Test
	public void testNotEmptyCollectionOfQString() {
	}

	@Test
	public void testNotEmptyMapOfQQString() {
	}

	@Test
	public void testHasText() {
	}

	@Test
	public void testGreaterThanZero() throws CMSException {
		BigDecimal d=new BigDecimal(1.1);
	    AsserUtil.greaterThanZero(d,"这个值小于等于0");
	}
	

}
