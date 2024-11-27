package top.heyqing.hm.common.exception;

import cn.hutool.core.util.StrUtil;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.heyqing.hm.common.responce.R;
import top.heyqing.hm.common.responce.RCode;

import java.sql.SQLSyntaxErrorException;

/**
 * ClassName:GlobalExceptionHandler
 * Package:top.heyqing.hm.common.exception
 * Description:
 * 全局异常处理类
 *
 * @Date:2024/11/27
 * @Author:Heyqing
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = CustomizeException.class)
    public R handle(CustomizeException e) {
        if (e.getError() != null) {
            return R.error().code(e.getError().getCode()).message(e.getError().getMessage());
        }
        return R.error().message(e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField() + fieldError.getDefaultMessage();
            }
        }
        return R.error().message(message).code(RCode.VALIDATE_FAILED.getCode());
    }

    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public R handleValidException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null) {
                message = fieldError.getField() + fieldError.getDefaultMessage();
            }
        }
        return R.error().message(message).code(RCode.VALIDATE_FAILED.getCode());
    }

    @ResponseBody
    @ExceptionHandler(value = SQLSyntaxErrorException.class)
    public R handleSQLSyntaxErrorException(SQLSyntaxErrorException e) {
        String message = e.getMessage();
        if (StrUtil.isNotEmpty(message) && message.contains("denied")) {
            message = "演示环境暂无修改权限，如需修改数据可本地搭建后台服务！";
        }
        return R.error().message(message);
    }
}

