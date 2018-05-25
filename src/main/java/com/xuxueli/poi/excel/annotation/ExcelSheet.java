package com.xuxueli.poi.excel.annotation;

import org.apache.poi.hssf.util.HSSFColor;

import com.xuxueli.poi.excel.util.SheetType;

import java.lang.annotation.*;

/**
 * 表信息
 *
 * @author xuxueli 2017-09-08 20:51:26
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ExcelSheet {

    /**
     * 表名称
     *
     * @return
     */
    String name() default "";

    /**
     * 表头/首行的颜色
     *
     * @return
     */
    HSSFColor.HSSFColorPredefined headColor() default HSSFColor.HSSFColorPredefined.LIGHT_GREEN;
    
    /**
     * 表复杂度类型
     * @return
     */
    SheetType sheetType() default SheetType.SIMPLE;

}

