package com.monster.lin.mvc.person.blog.entity;


import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/2/21
 * @since JDK 1.8
 */
@Component
public class User {

    @NotNull(message = "userName参数不能为空！",groups = Group.class)
    private String userName;

    @NotNull(message = "nationalFlag参数不能为空")
    private String nationalFlag;

    public User(){}

    public User(String userName,String nationalFlag) {
        this.userName = userName;
        this.nationalFlag = nationalFlag;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", nationalFlag='" + nationalFlag + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNationalFlag() {
        return nationalFlag;
    }

    public void setNationalFlag(String nationalFlag) {
        this.nationalFlag = nationalFlag;
    }
}
