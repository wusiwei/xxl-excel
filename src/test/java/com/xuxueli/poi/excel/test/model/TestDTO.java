package com.xuxueli.poi.excel.test.model;

import com.xuxueli.poi.excel.annotation.ExcelField;
import com.xuxueli.poi.excel.annotation.ExcelSheet;
import com.xuxueli.poi.excel.util.SheetType;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import java.util.Date;

/**
 * Java Object To Excel
 *
 * @author xuxueli 2017-09-12 11:20:02
 */
@ExcelSheet(name = "线路", headColor = HSSFColor.HSSFColorPredefined.LIGHT_GREEN , sheetType=SheetType.SIMPLE)
public class TestDTO {

    @ExcelField(name = "渠道")
    private String qudao;

    @ExcelField(name = "线路名称")
    private String name;

    @ExcelField(name = "1人")
    private Long price1;

    @ExcelField(name = "2人")
    private Long price2;

    @ExcelField(name = "3人")
    private Long price3;

    @ExcelField(name = "4人")
    private Long price4;

    @ExcelField(name = "5人")
    private Long price5;

    @ExcelField(name = "6人")
    private Long price6;
    
    @ExcelField(name = "5座包车")
    private Long pack5;

    @ExcelField(name = "7座包车")
    private Long pack7;

    
	public TestDTO(String qudao, String name, Long price1, Long price2, Long price3, Long price4, Long price5,
			Long price6, Long pack5, Long pack7) {
		super();
		this.qudao = qudao;
		this.name = name;
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.price4 = price4;
		this.price5 = price5;
		this.price6 = price6;
		this.pack5 = pack5;
		this.pack7 = pack7;
	}

	public String getQudao() {
		return qudao;
	}

	public void setQudao(String qudao) {
		this.qudao = qudao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice1() {
		return price1;
	}

	public void setPrice1(Long price1) {
		this.price1 = price1;
	}

	public Long getPrice2() {
		return price2;
	}

	public void setPrice2(Long price2) {
		this.price2 = price2;
	}

	public Long getPrice3() {
		return price3;
	}

	public void setPrice3(Long price3) {
		this.price3 = price3;
	}

	public Long getPrice4() {
		return price4;
	}

	public void setPrice4(Long price4) {
		this.price4 = price4;
	}

	public Long getPrice5() {
		return price5;
	}

	public void setPrice5(Long price5) {
		this.price5 = price5;
	}

	public Long getPrice6() {
		return price6;
	}

	public void setPrice6(Long price6) {
		this.price6 = price6;
	}

	public Long getPack5() {
		return pack5;
	}

	public void setPack5(Long pack5) {
		this.pack5 = pack5;
	}

	public Long getPack7() {
		return pack7;
	}

	public void setPack7(Long pack7) {
		this.pack7 = pack7;
	}

    
}