package com.charming.blog.utils;


import java.security.MessageDigest;

public class MD5Util {
    public static String Encode(String str){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[]byteDigest = md.digest();
            int i;
            StringBuffer buffer = new StringBuffer("");
            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buffer.append("0");
                buffer.append(Integer.toHexString(i));
            }
            //32位加密
            return buffer.toString();
            // 16位的加密
            //return buf.toString().substring(8, 24);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args){
        System.out.println(Encode("1234"));
    }
}
