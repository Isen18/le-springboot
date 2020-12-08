package com.example.isen.源码;

import java.util.Date;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.util.Assert;

/**
 * @author Isen
 * @date 2019/1/7 14:33
 * @since 1.0
 */
public class FormatterModel {

    @NumberFormat(style = Style.NUMBER, pattern = "#,###")
    private int totalCount;

    @NumberFormat(style = Style.PERCENT)
    private double discount;

    @NumberFormat(style = Style.CURRENCY)
    private double sumMoney;

    @DateTimeFormat(iso = ISO.DATE)
    private Date registerDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderDate;

    //省略getter/setter


    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public static void main(String[] args) throws NoSuchFieldException {
        //默认自动注册对@NumberFormat和@DateTimeFormat的支持
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();

        //准备测试模型对象
        FormatterModel model = new FormatterModel();
        model.setTotalCount(10000);
        model.setDiscount(0.51);
        model.setSumMoney(10000.13);
        model.setRegisterDate(new Date(2012 - 1900, 4, 1));
        model.setOrderDate(new Date(2012 - 1900, 4, 1, 20, 18, 18));

        //获取类型信息
        TypeDescriptor descriptor = new TypeDescriptor(FormatterModel.class.getDeclaredField("totalCount"));
        TypeDescriptor stringDescriptor = TypeDescriptor.valueOf(String.class);

        Assert.isTrue("10,000".equals(conversionService.convert(model.getTotalCount(), descriptor, stringDescriptor)));
        Assert.isTrue(model.getTotalCount() == (int)conversionService.convert("10,000", stringDescriptor, descriptor));


        descriptor = new TypeDescriptor(FormatterModel.class.getDeclaredField("registerDate"));
        Assert.isTrue("2012-05-01".equals(conversionService.convert(model.getRegisterDate(), descriptor, stringDescriptor)));
        Assert.isTrue(model.getRegisterDate().equals(conversionService.convert("2012-05-01", stringDescriptor, descriptor)));

        descriptor = new TypeDescriptor(FormatterModel.class.getDeclaredField("orderDate"));
        Assert.isTrue("2012-05-01 20:18:18".equals(conversionService.convert(model.getOrderDate(), descriptor, stringDescriptor)));
        Assert.isTrue(model.getOrderDate().equals(conversionService.convert("2012-05-01 20:18:18", stringDescriptor, descriptor)));
    }
}
