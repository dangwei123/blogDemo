package dangwei.exception;

/**
 * ClassName:ClientException
 * Package:dangwei.exception
 * Description:
 *
 * @Date:2020/5/11 11:43
 * @Author:DangWei
 */
public class ClientException extends BaseException {

    public ClientException(String code, String message) {
        this(code, message, null);
    }

    public ClientException(String code, String message, Throwable cause) {
        super("CLI"+code, "客户端异常："+message, cause);
    }
}