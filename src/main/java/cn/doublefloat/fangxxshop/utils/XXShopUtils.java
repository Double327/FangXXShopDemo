package cn.doublefloat.fangxxshop.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author 李广帅
 * @Date 2020/4/12 11:41 下午
 */
public class XXShopUtils {

    /**
     * 生成ID
     * @return ID编号
     */
    public static String getId() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        return uuid.toString().replace("-", "");
    }

    /**
     * 获取当前时间，并按照指定格式返回字符串
     * @return 时间字符串
     */
    public static String getTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        return simpleDateFormat.format(new Date());
    }
}
