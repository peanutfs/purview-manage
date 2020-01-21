package com.crossrainbow.pm.common.util;

import org.apache.commons.collections.MapUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 16:53 2020/1/19
 */
public class WebMapUtil {

    private static final String CODE_MAP_KEY = "code";

    private static final String MSG_MAP_KEY = "msg";

    public static Map<String, Object> newMap(){
        Map<String, Object> commMap = new HashMap<>();
        commMap.put(CODE_MAP_KEY, "200");
        commMap.put(MSG_MAP_KEY, "成功");
        return commMap;
    }

    public static void changeMap(Map<String, Object> changeMap, String code, String msg){
        if(MapUtils.isNotEmpty(changeMap)){
            changeMap.put(CODE_MAP_KEY, code);
            changeMap.put(MSG_MAP_KEY, msg);
        }
    }
}
