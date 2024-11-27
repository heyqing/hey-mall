package top.heyqing.hm.common.exception;

import top.heyqing.hm.common.responce.RCode;

/**
 * ClassName:Asserts
 * Package:top.heyqing.hm.common.exception
 * Description:
 * 断言处理类，用于抛出各种自定义异常
 *
 * @Date:2024/11/27
 * @Author:Heyqing
 */
public class Asserts {

    public static void error(String message) {
        throw new CustomizeException(message);
    }

    public static void error(RCode error) {
        throw new CustomizeException(error);
    }

}
