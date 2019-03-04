package com.monster.lin.mvc.person.blog.controller;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.beans.PropertyEditor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类 <code>{类名称}</code>{自定义类型转换器-系统提供的编辑器}
 *
 * @author zangbao.lin
 * @version 2019/2/25
 * @since JDK 1.8
 */
@Controller
public class DateController {
    //WebDataBinder对象为注册器，registerCustomEditor方法为注册方法
    //PropertyEditor对象为自定义编辑器接口
    //CustomDateEditor对象为系统提供的编辑器，类似的还有CustomBooleanEditor
    @InitBinder
    public void dataBinder(WebDataBinder binder){
        DateFormat dateFormat = new SimpleDateFormat( "yyyyMMdd" );
        //第二个参数表示是否为空
        PropertyEditor propertyEditor = new CustomDateEditor(dateFormat, true );
        binder.registerCustomEditor(Date.class , propertyEditor);
    }

    @RequestMapping("/tranDate")
    public ModelAndView tranDate(@RequestParam("date") Date date) {
        System.out.println(date.toString());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tranDate");
        return modelAndView;
    }
}
