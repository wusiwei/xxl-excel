package com.xuxueli.poi.excel.util;

/**
 * 处理表格异常
 * @author wusiwei
 *
 */
public class DealExcelException extends Exception{
	
	private static final long serialVersionUID = 4580644387835438929L;
	
	private String message;
	
	private int rowNum;
	
	private Object Data;
	
	
}
