package com.jijing.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AsserUtilTest {

	@Test
	public void testIsTrue() throws Exception {
		String a="aa";
		String b="bb";
		AsserUtil.isTrue(!a.equals(b),"这个是假的");
	}

	@Test
	public void testIsFalse() throws Exception {
		AsserUtil.isFalse(1>-1,"这个是真的");
	}

	@Test
	public void testNotNull() throws Exception {
		Person p=new Person();
		AsserUtil.notNull(p,"这个对象为空");
	}

	@Test
	public void testIsNull() throws Exception {
		Person p=new Person(1,"张三","11");
		AsserUtil.isNull(p,"这个对象为空");
	}

	@Test
	public void testNotEmptyCollectionOfQString() throws Exception {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		AsserUtil.notEmpty(list,"这个集合为空");
	}

	@Test
	public void testNotEmptyMapOfQQString() throws Exception {
		Map<String,Integer> map=new HashMap<>();
		map.put("张三",1);
		AsserUtil.notEmpty(map,"这个集合为空");
	}

	@Test
	public void testHasText() throws Exception {
		String s="asasa";
		AsserUtil.hasText(s,"这个字符串为空");
	}

	@Test
	public void testGreaterThanZero() throws Exception {
		BigDecimal d=new BigDecimal("33.2");
		AsserUtil.greaterThanZero(d,"这个值小于或者等于0");
	}

}
