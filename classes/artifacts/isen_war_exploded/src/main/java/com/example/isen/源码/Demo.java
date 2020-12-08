package com.example.isen.源码;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import org.springframework.beans.AbstractPropertyAccessor;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.ConfigurablePropertyAccessor;
import org.springframework.beans.PropertyAccessor;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.PropertyEditorRegistrySupport;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.beans.TypeConverter;
import org.springframework.beans.TypeConverterSupport;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.core.MethodParameter;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.method.annotation.RequestParamMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.InvocableHandlerMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.handler.AbstractHandlerMethodMapping;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;
import org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod;

/**
 * @author Isen
 * @date 2019/1/4 21:20
 * @since 1.0
 */
public class Demo {
    HandlerMethodArgumentResolver handlerMethodArgumentResolver;

    HandlerMethodReturnValueHandler handlerMethodReturnValueHandler;

    RequestMappingHandlerMapping requestMappingHandlerMapping;

    ServletInvocableHandlerMethod servletInvocableHandlerMethod;

    RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    DispatcherServlet dispatcherServlet;

    HandlerMethod handlerMethod;

    InvocableHandlerMethod invocableHandlerMethod;

    MethodParameter methodParameter;

    RequestCondition requestCondition;

    RequestMappingInfo requestMappingInfo;

    AbstractHandlerMethodMapping abstractHandlerMethodMapping;

    PropertyEditor propertyEditor;

    PropertyEditorSupport propertyEditorSupport;

    CustomBooleanEditor customBooleanEditor;

//    ResourcesBeanDefinitionParser resourcesBeanDefinitionParser;

    RequestParamMethodArgumentResolver requestParamMethodArgumentResolver;

    PropertyEditorRegistry propertyEditorRegistry;

    PropertyEditorRegistrySupport propertyEditorRegistrySupport;

    TypeConverter typeConverter;

    TypeConverterSupport typeConverterSupport;

//    TypeConverterDelegate typeConverterDelegate;

    SimpleTypeConverter simpleTypeConverter;

    PropertyAccessor propertyAccessor;

    ConfigurablePropertyAccessor configurablePropertyAccessor;

    BeanWrapper beanWrapper;

    AbstractPropertyAccessor abstractPropertyAccessor;

    BeanWrapperImpl beanWrapperImpl;

    DataBinder dataBinder;

    WebDataBinder webDataBinder;

//    @DeleteMapping

    ConversionService conversionService;

    Converter converter;

    Validator validator;

    FormattingConversionService formattingConversionService;

    RequestResponseBodyMethodProcessor requestResponseBodyMethodProcessor;
}
