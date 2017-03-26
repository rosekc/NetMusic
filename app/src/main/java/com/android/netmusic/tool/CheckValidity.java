package com.android.netmusic.tool;

/**
 * Created by Nothin on 2017-03-26.
 */

/**
 * 检查各种数据的合法性
 */
public class CheckValidity {

    /**
     * 检查手机号的合法性
     * @param PhoneNumber 手机号码
     * @return 检查结果
     */
    public static boolean checkPhoneNumber(String PhoneNumber)
    {
        return PhoneNumber.matches("^(13[0-9]|15[012356789]|17[013678]|18[0-9]|14[57])[0-9]{8}$");
    }
}
