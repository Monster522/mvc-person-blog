package com.monster.lin.mvc.person.blog.servlet.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * 类 <code>{类名称}</code>{单例，生成token}
 *
 * @author zangbao.lin
 * @version 2019/2/21
 * @since JDK 1.8
 */

public class TokenGenerate {

    private TokenGenerate() {}

    private static final TokenGenerate instance = new TokenGenerate();

    public static TokenGenerate getInstance() {
        return instance;
    }

    //生成Token
    public String makeToken() {
        //new Random().nextInt(n)的作用是：生成0到n之间随机数
        String token = (System.currentTimeMillis() + new Random().nextInt(999999999)) + "";
        try {
            //MessageDigest为加密类，生成MD5的加密类
            MessageDigest md =  MessageDigest.getInstance("md5");
            //利用MD5算法加密token内容
            byte md5[] = md.digest(token.getBytes());
            //利用base64编码，md5为明文内容
            BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(md5);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
