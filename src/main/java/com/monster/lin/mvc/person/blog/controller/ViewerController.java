package com.monster.lin.mvc.person.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;


/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/2/25
 * @since JDK 1.8
 */
@Controller
@SessionAttributes(value = {"name","address","ext"},types = String.class)
public class ViewerController {
    @ModelAttribute("name")
    public String getName() {
        return "Tencent";
    }

    @ModelAttribute("address")
    public String getAddress() {
        return "中山园路1001号";
    }

    @RequestMapping(value = "showhand",method = RequestMethod.GET)
    public ModelAndView showView(@ModelAttribute("name")String name,String ext,
                                 @ModelAttribute("address")String address, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        HttpSession session = request.getSession();
        Enumeration emun = session.getAttributeNames();
        while (emun.hasMoreElements()) {
            System.out.println(emun.nextElement());
        }

        modelAndView.setViewName("showCompany");
        modelAndView.addObject("name",name);
        modelAndView.addObject("area",address);
        return modelAndView;
    }
}
