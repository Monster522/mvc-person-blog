package com.monster.lin.mvc.person.blog.conf;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import java.beans.PropertyEditor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类 <code>{类名称}</code>{实现自定义编辑器，然后注入适配器中}
 *
 * @author zangbao.lin
 * @version 2019/2/26
 * @since JDK 1.8
 */

public class MyWebBindingInit implements WebBindingInitializer {
    public void initBinder(WebDataBinder binder, WebRequest request) {
        DateFormat dateFormat = new SimpleDateFormat( "yyyyMMdd" );
        //第二个参数表示是否为空
        PropertyEditor propertyEditor = new CustomDateEditor(dateFormat, true );
        binder.registerCustomEditor(Date.class , propertyEditor);
    }
}
