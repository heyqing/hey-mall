package top.heyqing.hm.common.exception;

import top.heyqing.hm.common.responce.RCode;

/**
 * ClassName:CustomizeException
 * Package:top.heyqing.hm.common.exception
 * Description:
 * 自定义异常
 *
 * @Date:2024/11/27
 * @Author:Heyqing
 */
public class CustomizeException extends RuntimeException {

    private RCode error;

    public CustomizeException(RCode error) {
        super(error.getMessage());
        this.error = error;
    }

    public CustomizeException(String message) {
        super(message);
    }

    public CustomizeException(Throwable throwable) {
        super(throwable);
    }

    public CustomizeException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public RCode getError() {
        return error;
    }
}
