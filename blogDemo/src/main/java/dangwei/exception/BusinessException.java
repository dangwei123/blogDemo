package dangwei.exception;

/**
 * ClassName:BusinessException
 * Package:dangwei.exception
 * Description:
 *
 * @Date:2020/5/17 9:08
 * @Author:DangWei
 */
public class BusinessException extends BaseException {
    public BusinessException(String code, String message) {
        this(code, message, null);
    }

    public BusinessException(String code, String message, Throwable cause) {
        super("BUS"+code, "业务异常："+message, cause);
    }
}
