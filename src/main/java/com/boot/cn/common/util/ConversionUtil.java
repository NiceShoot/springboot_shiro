package com.boot.cn.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

/**
 * @author jiabing
 * @Package com.jiabing.com.common.util
 * @Description: 转换工具类
 * @date 2018/6/20 11:14
 */
public class ConversionUtil {

    private final static Logger logger = LoggerFactory.getLogger(ConversionUtil.class);
    public ConversionUtil() {
    }

    private static Object conversion(Object from,Object to){
        if(null == from){
            return null;
        }
        try {
            BeanUtils.copyProperties(from,to);
        }catch (Exception e){
            logger.error("转换出错"+e);
            e.printStackTrace();
        }
        return to;
    }


    public static <T> T Po2Dto(Class<T> clazz,Object po){
        try {
            Class<?> aClass = clazz.forName(clazz.getName());
            Object dto = aClass.newInstance();
            return (T) conversion(po,dto);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T Dto2Po(Class<T> clazz,Object dto){
        try {
            Class<?> aClass = clazz.forName(clazz.getName());
            Object po = aClass.newInstance();
            Object conversion = conversion(dto,po);
            return (T)conversion;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T Dto2Vo(Class<T> clazz,Object dto){
        try {
            Class<?> aClass = clazz.forName(clazz.getName());
            Object vo = aClass.newInstance();
            Object conversion = conversion(dto,vo);
            return (T)conversion;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T Vo2Dto(Class<T> clazz,Object vo){
        try {
            Class<?> aClass = clazz.forName(clazz.getName());
            Object dto = aClass.newInstance();
            Object conversion = conversion(vo,dto);
            return (T)conversion;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
