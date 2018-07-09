package com.ljw.core.domain;

import java.io.Serializable;
import java.util.Map;


public class RedisMessageRecord implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1438101470817814431L;
	
	
	private String operator;//操作人
	private Map<String, Object> context;//内容
	private String date;//日期
	
	
	
	
	
	@Override
	public String toString() {
		return "RedisMessageRecord [operator=" + operator + ", context=" + context + ", date=" + date + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((context == null) ? 0 : context.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RedisMessageRecord other = (RedisMessageRecord) obj;
		if (context == null) {
			if (other.context != null)
				return false;
		} else if (!context.equals(other.context))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		return true;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Map<String, Object> getContext() {
		return context;
	}
	public void setContext(Map<String, Object> context) {
		this.context = context;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	
	

}
