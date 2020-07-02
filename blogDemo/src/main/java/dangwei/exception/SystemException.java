package dangwei.exception;

/**
 * ClassName:SystemException
 * Package:dangwei.exception
 * Description:
 *
 * @Date:2020/5/17 14:45
 * @Author:DangWei
 */
public class SystemException extends BaseException {
    public SystemException(String code, String message) {
        this(code, message, null);
    }

    public SystemException(String code, String message, Throwable cause) {
        super("SYS"+code, "系统异常："+message, cause);
    }
}
