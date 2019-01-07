package com.example.isen.源码;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.util.Assert;

/**
 * @author Isen
 * @date 2019/1/7 14:28
 * @since 1.0
 */
public class FormatterDemo {

    public static void main(String[] args) {
//        CurrencyFormatter currencyFormatter = new CurrencyFormatter();
//        currencyFormatter.setFractionDigits(2);//保留小数点后几位
//        currencyFormatter.setRoundingMode(RoundingMode.CEILING);//舍入模式（ceilling表示四舍五入）
//
////1、将带货币符号的字符串“$123.125”转换为BigDecimal("123.00")
//        Assert.assertEquals(new BigDecimal("123.13"), currencyFormatter.parse("$123.125", Locale.US));
////2、将BigDecimal("123")格式化为字符串“$123.00”展示
//        Assert.assertEquals("$123.00", currencyFormatter.print(new BigDecimal("123"), Locale.US));
//        Assert.assertEquals("￥123.00", currencyFormatter.print(new BigDecimal("123"), Locale.CHINA));
//        Assert.assertEquals("￥123.00", currencyFormatter.print(new BigDecimal("123"), Locale.JAPAN));
    }


    public void test() {
//        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
//        //默认不自动注册任何Formatter
//        CurrencyFormatter currencyFormatter = new CurrencyFormatter();
//        currencyFormatter.setFractionDigits(2);//保留小数点后几位
//        currencyFormatter.setRoundingMode(RoundingMode.CEILING);//舍入模式（ceilling表示四舍五入）
//        //注册Formatter SPI实现
//        conversionService.addFormatter(currencyFormatter);
//
//        //绑定Locale信息到ThreadLocal
//        //FormattingConversionService内部自动获取作为Locale信息，如果不设值默认是 Locale.getDefault()
//        LocaleContextHolder.setLocale(Locale.US);
//        Assert.assertEquals("$1,234.13",
//                conversionService.convert(new BigDecimal("1234.128"), String.class));
//        LocaleContextHolder.setLocale(null);
//
//        LocaleContextHolder.setLocale(Locale.CHINA);
//        Assert.assertEquals("￥1,234.13",
//                conversionService.convert(new BigDecimal("1234.128"), String.class));
//        Assert.assertEquals(new BigDecimal("1234.13"),
//                conversionService.convert("￥1,234.13", BigDecimal.class));
//        LocaleContextHolder.setLocale(null);
//    }
    }
}
