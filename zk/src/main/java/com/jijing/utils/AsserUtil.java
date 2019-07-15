package com.jijing.utils;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Map;

public class AsserUtil{
     
	
	/**
	 * 
	 * @Title: isTrue 
	 * @Description:断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息
	 * @param condition
	 * @param message
	 * @return: void
	 * @throws CMSException 
	 * @throws Exception 
	 */
	public static void isTrue(boolean condition, String message) throws CMSException{
		 if(!condition){ 
			throw new CMSException(message);
		 }
	        
	}
	/**
	 * 
	 * @Title: isFalse 
	 * @Description:断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息
	 * @param condition
	 * @param message
	 * @return: void
	 * @throws CMSException 
	 * @throws Exception 
	 */
	public static void isFalse(boolean condition, String message) throws CMSException{
		 if(condition){
			 throw new CMSException(message);
		 }
	        
    }
	/**
	 * 
	 * @Title: notNull 
	 * @Description:断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息
	 * @param obj
	 * @param message
	 * @return: void
	 * @throws CMSException 
	 * @throws Exception 
	 */
	public static void notNull(Object obj, String message) throws CMSException{
		 if(obj==null) {
			 throw new CMSException(message);
		 }
    }
	/**
	 * 
	 * @Title: isNull 
	 * @Description:断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息
	 * @param obj
	 * @param message
	 * @return: void
	 * @throws CMSException 
	 * @throws Exception 
	 */
	public static void isNull(Object obj, String message) throws CMSException{
		if(obj!=null) {
			throw new CMSException(message);
		}
   }
	/**
	 * 
	 * @Title: notEmpty 
	 * @Description:断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息
	 * @param coll
	 * @param message
	 * @return: void
	 * @throws CMSException 
	 * @throws Exception 
	 */
	public static void notEmpty(Collection<?> coll, String message) throws CMSException{
		if(coll==null||coll.size()==0){
			throw new CMSException(message);
		}
    }
	/**
	 * 
	 * @Title: notEmpty 
	 * @Description:断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @param map
	 * @param message
	 * @return: void
	 * @throws CMSException 
	 * @throws Exception 
	 */
	public static void notEmpty(Map<?,?> map, String message) throws CMSException{
		    if(map==null||map.isEmpty()) {
		    	throw new CMSException(message);
		    }
		}
	 /**
	  * 
	  * @Title: hasText 
	  * @Description:断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息
	  * @param condition
	  * @param message
	  * @return: void
	 * @throws CMSException 
	 * @throws Exception 
	  */
	public static void hasText(String condition, String message) throws CMSException{
		 if(condition==null ||condition.trim().length()<0){
			 throw new CMSException(message);
		 }
    }
	
     /**
      * 
      * @Title: greaterThanZero 
      * @Description:断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息 
      * @param value
      * @param message
      * @return: void
     * @throws CMSException 
     * @throws Exception 
      */
	public static void greaterThanZero(BigDecimal value, String message) throws CMSException{
		     if(value.intValue()<=0) {
		    	 throw new CMSException(message);
		     }
	}
	

	

	



	


}
